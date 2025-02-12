class Ordenador(
    val tipoOrdenador: TipoOrdenador = TipoOrdenador.BASICO,
    nombre: String,
    precio: Double,
    id: Int
) : Articulo(nombre, precio, id) {
    override fun promocionNavidad(porcentajeRebaja: Double) {
        if (precio > 500) {
            precio -= (porcentajeRebaja/100 * precio)
        }
    }
}