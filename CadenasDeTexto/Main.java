package CadenasDeTexto;

public class Main {

    public static void main(String[] args) {

        Cadena cadena = new Cadena();

        String chain = "";

        chain = cadena.reverse("hola mundo");

        System.out.println("Inverted word is: "+chain);

        ArrayUniBI arrayUniBI = new ArrayUniBI();

        arrayUniBI.array();
        arrayUniBI.array2();

        Vectores vectores = new Vectores();

        vectores.vector();

        ArrayLinkedLists arrayLinkedLists = new ArrayLinkedLists();

        arrayLinkedLists.arraylist();
        arrayLinkedLists.arraylistRelleno();

        Divide divide = new Divide();
        try {
            divide.dividePorCero(4,0);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse "+ e);
        }finally {
            System.out.println("Demo de codigo");
        }

        Streams streams = new Streams();

        streams.streamInPrnt();


       FinalProject demo = new FinalProject();

       demo.eventPlanner();
    }
}
