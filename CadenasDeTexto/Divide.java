package CadenasDeTexto;

public class Divide {
    public int dividePorCero (int A, int B)throws ArithmeticException{
        try {
            int resultado1 = A/B;
            System.out.println("Resultado de la division es: "+ resultado1);
            return resultado1;
        }catch (ArithmeticException e){
            throw new ArithmeticException("No se puede dividir por 0");
        }
    }
}
