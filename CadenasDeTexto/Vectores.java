package CadenasDeTexto;

import java.util.Vector;

public class Vectores {

    public void vector (){

        Vector<String> nombres = new Vector<>(5);
        nombres.add("Sabrina");
        nombres.add("Sofia");
        nombres.add("Camila");
        nombres.add("Hernesto");
        nombres.add("Marco");

        for (int i = 0; i<nombres.size(); i ++){
            System.out.println("El valor es: "+ nombres.get(i) + " La posicion es: "+ i);
        }

        // Elementos 2 y 3 removidos de nombres
        nombres.remove(1);
        nombres.remove(2);

        System.out.println("Nombres: "+ nombres+ " El tamaño del vector es ahora de: "+ nombres.size());
    }
}

/**
 * El problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo vector
 * seria que cada vez que quisieromos añadir nuevos elementos al vector, este tendria que redimensionarse y esto implica asignar
 * una nueva area en memoria, copiar los elementos ya añadidos(existentes) al nuevo espacio y liberar memoria anterior
 * por lo tanto esto conllevaria a una gran cantidad de operaciones costosas en terminos de tiempo y recursos.
 */
