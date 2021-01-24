package cache

import java.time.LocalDateTime

interface IGenericCache<K, V> {
    fun size() : Int

    operator fun set(key: K, value: V)

    operator fun get(key: K) : V?

    fun remove(key: K)

    fun clear()

    fun clean()
}

interface ICacheValue<V> {
    fun getValue() : V

    fun getCreatedAt() : LocalDateTime

}