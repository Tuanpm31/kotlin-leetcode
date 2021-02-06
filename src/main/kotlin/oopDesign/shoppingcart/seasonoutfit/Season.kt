package oopDesign.shoppingcart.seasonoutfit

import oopDesign.shoppingcart.data.Outfit

abstract class Season {
    abstract fun getOutfit(): Outfit
    open fun next(): Outfit = SummerOutfit().getOutfit()
}