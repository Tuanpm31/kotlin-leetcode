package oopDesign.shoppingcart.seasonoutfit

import oopDesign.shoppingcart.data.Outfit
import oopDesign.shoppingcart.data.Pant
import oopDesign.shoppingcart.data.Shoe
import java.awt.Color

object OutfitFactory {
    fun getOutfit(style: Style): Outfit {
        return when (style) {
            Style.SUMMER -> Outfit(Pant("short", 1), Shoe("loafer", 2))
            Style.FALL -> Outfit(Pant("short", 1), Shoe("loafer", 2))
            Style.SPORT -> Outfit(Pant("short", 1), Shoe("loafer", 2))
        }
    }
}

enum class Style {
    SUMMER, FALL, SPORT
}