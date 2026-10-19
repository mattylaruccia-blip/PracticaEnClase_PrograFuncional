abstract class Animal_v2(val nombre: String) {
  def sonido(): String
}

trait Voladores{
    def volar: String
}

trait Nadadores{
    def nadar: String
}

class Perro_v2(nombre: String)extends Animal_v2(nombre){
    def sonido(): String = "Guaaaaaaaaaauuuuuu"
}

class Pato_v2 ( nombre: String)extends Animal_v2(nombre) with Voladores with Nadadores{
    def sonido(): String = "Kuaaack"
    def nadar: String = "Splashhhhh"
    def volar: String = "Fiiuuuuuuuuuu"
}

class Pez( nombre: String)extends Animal_v2(nombre) with Nadadores{
    def sonido(): String = "Mamahuevo digo Gluc Gluc"
    def nadar: String = "*Nada bajo el agua*"
}

object ejercicio_2 {
    def main(args: Array[String]): Unit = {
        val animal1 = new Perro_v2("Sky")
        println(animal1.sonido())
        println()

        val animal2 = new Pato_v2("Donald")
        println(animal2.sonido())
        println(animal2.nadar)
        println(animal2.volar)
        println()

        val animal3 = new Pez("Trucha")
        println(animal3.sonido())
        println(animal3.nadar)
    }
}