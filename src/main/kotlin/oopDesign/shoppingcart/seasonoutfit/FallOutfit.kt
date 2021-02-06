package oopDesign.shoppingcart.seasonoutfit

import oopDesign.shoppingcart.data.Outfit

class FallOutfit : Season() {
    override fun getOutfit(): Outfit {
        return if (CurrentSeason.currentSeason == "fall") {
            OutfitFactory.getOutfit(Style.FALL)
        } else {
            next()
        }
    }
}