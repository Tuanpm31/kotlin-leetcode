package cache

import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import java.util.stream.Collector
import java.util.stream.Collectors

typealias AnyGenericCache = IGenericCache<Any, Any>

object ImplCache : AnyGenericCache {

    private const val DEFAULT_TIME_OUT = 60000L

    var timeout: Long = DEFAULT_TIME_OUT

    private val mapCache = HashMap<Any, CacheValue>()

    override fun size(): Int = mapCache.size

    override fun set(key: Any, value: Any) {
        synchronized(this) {
            mapCache[key] = createCacheValue(key, value)
        }
    }

    override fun get(key: Any): Any? {
        clean()
        return mapCache[key]?.getValue()
    }

    override fun remove(key: Any) {
        synchronized(this) {
            mapCache.remove(key)
        }
    }

    override fun clear() {
        synchronized(this) {
            mapCache.clear()
        }
    }

    override fun clean() {
        getExpiredKeys().forEach {
            mapCache.remove(it)
        }
    }

    private fun getExpiredKeys(): Set<Any> {
        return mapCache.keys.filter { isExpired(it) }.toSet()
    }

    private fun isExpired(key: Any): Boolean {
        val expiredTime = mapCache[key]?.createdAt()?.plus(timeout, ChronoUnit.MILLIS)
        return expiredTime?.isAfter(LocalDateTime.now()) ?: false
    }

    private fun createCacheValue(key: Any, value: Any): CacheValue {
        return object : CacheValue {
            override fun getValue(): Any = value

            override fun createdAt(): LocalDateTime = LocalDateTime.now()

        }
    }

    interface CacheValue {
        fun getValue(): Any

        fun createdAt(): LocalDateTime
    }

}

class Counter {
    var temp = 0
    fun increment() {
        synchronized(this) {
            temp += 1
        }
    }
}

fun main() {
    val s = Counter()


    val t1 = Thread {
        for (i in 1..10000) {
            s.increment()
        }
    }

    val t2 = Thread {
        for (i in 1..10000) {
            s.increment()
        }
    }

    t1.start()
    t2.start()

    t1.join()
    t2.join()

    println(s.temp)
}