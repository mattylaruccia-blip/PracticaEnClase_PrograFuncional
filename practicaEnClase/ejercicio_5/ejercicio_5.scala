abstract class Vehiculo( val marca: String, val velocidadMaxima: Double){
    def descripcion(): String
}

trait Electrico{
    def cargar(): String = "Cargando.... 100% de energia"
}

trait Recargable{
    def recargar(): String = "Recargando combustible"
}

class Automovil(marca: String, velocidadMaxima: Double)extends Vehiculo(marca, velocidadMaxima) with Recargable{
    def descripcion(): String = s"Automovil marca: $marca, que llega a una velocidad maxima de $velocidadMaxima km/h y de tipo Recargable"
}

class Motocicleta(marca: String, velocidadMaxima: Double)extends Vehiculo(marca, velocidadMaxima) with Recargable{
    def descripcion(): String = s"Motocicleta marca: $marca, que llega a una velocidad maxima de $velocidadMaxima km/h y de tipo Recargable"
    override def recargar(): String = "Cargando combustible a la moto"
}

class AutoElectrico(marca: String, velocidadMaxima: Double)extends Vehiculo(marca, velocidadMaxima) with Electrico{
    def descripcion(): String = s"Automovil marca: $marca, que llega a una velocidad maxima de $velocidadMaxima km/h y de tipo Electrico"
}

object ejercicio_5{
    def main (args: Array[String]): Unit = {
        val vehiculo1 = new Automovil("Fiat", 800)
        println(vehiculo1.descripcion())
        println(vehiculo1.recargar())

        val vehiculo2 = new Motocicleta("Yamaha", 600)
        println(vehiculo2.descripcion())
        println(vehiculo2.recargar())

        val vehiculo3 = new AutoElectrico("Tesla", 900)
        println(vehiculo3.descripcion())
        println(vehiculo3.cargar())
    }
}