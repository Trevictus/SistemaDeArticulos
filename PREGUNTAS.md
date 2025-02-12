### Responde a las siguientes preguntas:

**¿De qué tipo genera en la lista por defecto el compilador?**  
De tipo genérico.  

**¿Qué está ocurriendo en este ejemplo con respecto a lo que hemos visto del polimorfismo de la herencia?**  
Que cuando se llama al método de la instancia ordenador2, se ejecuta la versión del método de la clase hija y no la de la clase padre.

**¿Qué pasaría si creáramos la lista con listOf<Ordenador>?**  Que la instancia de la clase Articulo no entraría en la lista ya que estamos declarando que solo habrá en ella instancias de Ordenador.  

**¿Y si la hiciéramos con listOf`<Any>`?**  
Que estaríamos declarando que cualquier clase de objeto tiene cabida en la lista, ya sea un dato, una instancia de clase o cualquierotro tipo de objeto.