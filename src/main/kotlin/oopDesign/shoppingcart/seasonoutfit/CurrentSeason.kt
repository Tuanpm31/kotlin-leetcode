package oopDesign.shoppingcart.seasonoutfit

object CurrentSeason {
    var currentSeason = "summer"

    fun getSeasonOutfit() = SummerOutfit().getOutfit()
}