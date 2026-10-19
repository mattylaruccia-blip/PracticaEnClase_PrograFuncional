trait Notificacion {
  def enviar(mensaje: String): String
}

class Email(val remitente: String, val destinatario: String)extends Notificacion{
    def enviar(mensaje: String): String = s"Remitente: $remitente | destinatario: $destinatario : $mensaje"
}

class SMS(val destinatario: String)extends Notificacion{
    def enviar(mensaje: String): String = s"Enviando SMS para $destinatario: $mensaje"
}

class Push() extends Notificacion{
    def enviar(mensaje: String): String = s"Notificacion Push: $mensaje"
}

object ejercicio_4{

    def procesarNotificacion(notificacion: Notificacion,mensaje: String): String = {
        notificacion.enviar(mensaje)
    }

    def main (args: Array[String]): Unit = {
        val notificacion1 = new Email("Jose Miranda", "Paolo Ellias")
        println(procesarNotificacion(notificacion1,"Es un Mono :)" ))

        val notificacion2 = new SMS ("Ana Z")
        println(procesarNotificacion(notificacion2,"Me quede sin whatsapp, esperame en la casa pls" ))

        val notificacion3 = new Push
         println(procesarNotificacion(notificacion3,"Su pedido a llegado" ))
    }
}