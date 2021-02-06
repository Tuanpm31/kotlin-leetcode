package oopDesign.shoppingcart

import oopDesign.shoppingcart.data.Outfit

interface ShoppingCartChangedListener {
    fun onOutfitAdded(outfit: Outfit, nums: Int)

    fun onOutfitRemoved(outfit: Outfit, nums: Int)
}