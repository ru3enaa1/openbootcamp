package Ejercicio3;

public class EstructurasDeControl {

    public static void main(String[] args) {

        String[] palabras = {"Gracias ", "OpenBootcamp", "!"};
        String resultado = ConcatenarTexto(palabras);
        System.out.println("Resultado Final: " + resultado);


    }

    public static String ConcatenarTexto(String[] palabras) {
        StringBuilder sb = new StringBuilder();

        for (String texto : palabras) {
            sb.append(texto);
        }

        return sb.toString();

    }

}
