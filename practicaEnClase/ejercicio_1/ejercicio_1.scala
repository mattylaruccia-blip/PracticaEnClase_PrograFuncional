trait Figura_v2{
  def area: Double
}

class Rectangulo_v2(val base: Double, val altura: Double)extends Figura_v2{
    def area: Double = base * altura
}

class Circulo(val radio: Double)extends Figura_v2{
    def area: Double = math.Pi * radio * radio
    
}

class Triangulo(val base: Double, val altura: Double) extends Figura_v2{
    def area: Double = base * altura / 2
}

object ejercicio_1{

def mostrarArea(figura: Figura_v2): Double = {
    figura.area
}

    def main(args: Array[String]): Unit = {
        val figura1 = new Rectangulo_v2(10, 25)
        println(mostrarArea(figura1))
        val figura2 = new Circulo(45)
        println(mostrarArea(figura2))
        val figura3 = new Triangulo(80.5, 74)
        println(mostrarArea(figura3))
    }
    
}