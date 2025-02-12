open class Articulo(private var nombre: String, var precio: Double, private val id: Int) {

    companion object {
        private var totalArticulos = 0
        fun generarId(): Int {
            totalArticulos += 1
            return totalArticulos
        }
    }

    open fun promocionNavidad(porcentajeRebaja: Double) {
        precio -= (porcentajeRebaja/100 * precio)

    }

    override fun toString(): String {
        return "{$nombre} - {${"%.2f".format(precio)}}€ (ID: {$id}"
    }
}