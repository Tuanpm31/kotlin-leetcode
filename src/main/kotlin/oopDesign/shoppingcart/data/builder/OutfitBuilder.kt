package oopDesign.shoppingcart.data.builder

import oopDesign.shoppingcart.data.Clothing
import oopDesign.shoppingcart.data.Outfit
import oopDesign.shoppingcart.data.Pant
import oopDesign.shoppingcart.data.Shoe

class OutfitBuilder {
    lateinit var shoe: Shoe
    lateinit var pant: Pant

    private val clothes = mutableListOf<Clothing>()

    fun addClothing(clothing: Clothing) {
        clothes.add(clothing)
    }

    fun build(): Outfit {
        clothes.forEach {
            when (it) {
                is Shoe -> shoe = it
                is Pant -> pant = it
            }
        }
        return Outfit(pant, shoe)
    }
}