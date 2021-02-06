package oopDesign.shoppingcart.seasonoutfit

import oopDesign.shoppingcart.data.Outfit

class SummerOutfit : Season() {
    override fun getOutfit(): Outfit {
        return if (CurrentSeason.currentSeason == "summer") {
            OutfitFactory.getOutfit(Style.SUMMER)
        } else {
            next()
        }
    }

    override fun next(): Outfit = SportOutfit().getOutfit()
}