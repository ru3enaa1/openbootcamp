package CadenasDeTexto;

public class Cadena {

    public String reverse (String texto){

       String word = "";

        for (int i = texto.length()-1; i>=0; i--){
            word += texto.charAt(i);
        }
        return word;
    }

}

