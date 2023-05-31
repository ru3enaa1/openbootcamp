package mainpackage;

public class Main {
    public static void main(String[] args) {
        int numeroif = -34;
        int numeroWhile = 0;
        int numeroDoWhile = 4;
        int numeroFor = 0;
        String estacion = "Verano";

        //IF
        if (numeroif > 0){
            System.out.println("positivo");
        } else
            if (numeroif < 0){
                System.out.println("negativo");
            } else {
                System.out.println("0");
            }

         //WHILE
         if (numeroWhile >= 3){
                System.out.println("Numero Mayor o igual a 3 no entra al bucle");
         }else {
             while (numeroWhile < 3) {
                 numeroWhile = numeroWhile + 1;
                 System.out.println("La variable while ahora es: " + numeroWhile);
             }
         }

         //DO WHILE
        do{
            numeroDoWhile = numeroDoWhile + 1;
            System.out.println("La variable DoWhile ahora es: " + numeroDoWhile);
        }while (numeroDoWhile < 3);

        //FOR
        for (; numeroFor <= 3; numeroFor = numeroFor + 1);{
            System.out.println("La variable Numerofor ahora es: " + numeroFor);
        }

        //SWITCH
        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Verano":
                System.out.println("Hace Calor, estamos en Verano");
                break;
            case "Invierno":
                System.out.println("Hace frio, estamos en invierno");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
        }
        }



