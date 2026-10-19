abstract class Empleado(val nombre: String, val salarioBase: Double) {
  def salarioTotal: Double
}

class Desarrollador(nombre: String, salarioBase: Double, val bonoFijo: Double) extends Empleado(nombre, salarioBase){
    def salarioTotal: Double = salarioBase + bonoFijo
}

class Vendedor(nombre: String, salarioBase: Double, val ventas: Double, val comision: Double ) extends Empleado(nombre, salarioBase) {
    def salarioTotal: Double = salarioBase + ventas*comision
}

class Gerente (nombre: String, salarioBase: Double, val bonoPorcentual: Double)extends Empleado(nombre, salarioBase){
    def salarioTotal: Double = salarioBase + salarioBase*bonoPorcentual
}

object ejercicio_3{
    def main (args: Array[String]): Unit = {
        val empleado1 = new Desarrollador("Alvin Alejo", 3000, 499.99)
        println(s"El salario total del empleado ${empleado1.nombre} es ${empleado1.salarioTotal}")

        val empleado2 = new Vendedor("Patricio Estrella", 2500, 700, 0.3)
        println(s"El salario total del empleado ${empleado2.nombre} es ${empleado2.salarioTotal}")

        val empleado3 = new Gerente("Calamardo Tentaculos", 3500, 0.2)
        println(s"El salario total del empleado ${empleado3.nombre} es ${empleado3.salarioTotal}")
    }
}