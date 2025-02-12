fun main(){
    val articulo1 = Articulo("Sombrilla", 25.0, Articulo.generarId())
    val articulo2 = Articulo("Altavoz", 45.0, Articulo.generarId())

    val ordenador1 = Ordenador(TipoOrdenador.BASICO, "Lenovo", 399.99, Articulo.generarId())
    val ordenador2 = Ordenador(TipoOrdenador.GAMING, "Asus", 1299.99, Articulo.generarId())

    val productos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    for (producto in productos){
        producto.promocionNavidad(25.0)
        println(producto.toString())
    }
}