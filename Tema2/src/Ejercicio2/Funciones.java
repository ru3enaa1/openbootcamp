package Ejercicio2;

public class Funciones {

    public static void main(String[] args) {

        float precio = 20.99f;
        float iva = 6.50f;
        float precioIva = getPrecioTotal(20.99f, 6.50f);
        System.out.println("Precio: "+ precio + " + " + "IVA: "+ iva);
        System.out.println("Precio total con IVA: "+ precioIva);
    }

    static float getPrecioTotal(float precio, float iva){
        return precio + iva;
    }

    }


