package CadenasDeTexto;

public class ArrayUniBI {

    public void array() {

        String arrayUni[] = {"Ruben", "Mariana", "Adriana", "Mario", "Samuel"};

        System.out.println("La longitud del array es: "+arrayUni.length);

        for (int i = 0; i<arrayUni.length; i++){

            System.out.println("Nombre Actual: "+ arrayUni[i]+ " en posicion: "+i);
        }
    }

    //Array 2 filas x 4 columnas
    public  void  array2(){

        int arrayBi[][] = {
                {1, 2, 3, 4,},
                {20, 15, 23, 30},
        };

        for (int i = 0; i<arrayBi.length; i++){
            System.out.println("Valor de i: "+ i);

            for (int j = 0; j<arrayBi[i].length; j++){
                System.out.println("Estoy en i: "+ i + " j= " + j);
                System.out.println(arrayBi[i][j]);
            }
        }
    }

}
