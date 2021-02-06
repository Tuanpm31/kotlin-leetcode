package oopDesign.shoppingcart.seasonoutfit

import oopDesign.shoppingcart.data.Outfit

class SportOutfit: Season() {
    override fun getOutfit(): Outfit {
        return if (CurrentSeason.currentSeason == "sport") {
            OutfitFactory.getOutfit(Style.SPORT)
        } else {
            next()
        }
    }

    override fun next(): Outfit = FallOutfit().getOutfit()
}