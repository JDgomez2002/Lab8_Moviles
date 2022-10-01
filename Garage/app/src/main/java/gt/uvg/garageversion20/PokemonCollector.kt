package gt.uvg.garageversion20

import gt.uvg.garageversion20.model.Car

class PokemonCollector {

    fun getPokemonList(): List<Car> {
        return listOf(
            Car(1, "bulbasaur"),
            Car(2, "ivysaur"),
            Car(3, "venusaur"),
            Car(4, "charmander"),
            Car(5, "charmeleon"),
            Car(6, "charizard"),
            Car(7, "squirtle"),
            Car(8 , "wartortle"),
            Car(9, "blastoise"),
            Car(10,"caterpie")
        )
    }
}