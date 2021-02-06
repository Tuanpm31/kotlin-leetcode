package oopDesign.shoppingcart

import oopDesign.shoppingcart.data.Outfit
import oopDesign.shoppingcart.seasonoutfit.CurrentSeason

object ShoppingCart {
//    companion object {
//        private var instance: ShoppingCart? = null
//
//        fun getInstance(): ShoppingCart {
//            if (instance == null) instance = ShoppingCart()
//            return instance!!
//        }
//    }

    private val outfits = ArrayList<Outfit>()

    private val listeners = ArrayList<ShoppingCartChangedListener>()

    fun add(outfit: Outfit) {
        outfits.add(outfit)
        listeners.forEach { it.onOutfitAdded(outfit, outfits.size) }
    }

    fun remove(outfit: Outfit) {
        if (outfits.contains(outfit)) outfits.remove(outfit)
        listeners.forEach { it.onOutfitRemoved(outfit, outfits.size) }
    }

    fun addOnShoppingCartListener(listener: ShoppingCartChangedListener) {
        listeners.add(listener)
    }

    fun removeOnShoppingCartListener(listener: ShoppingCartChangedListener) {
        if (listeners.contains(listener)) listeners.remove(listener)
    }
}