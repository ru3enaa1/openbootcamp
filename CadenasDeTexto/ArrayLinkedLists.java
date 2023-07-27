package CadenasDeTexto;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedLists {


    public void arraylist (){

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Colombia");
        lista.add("Argentina");
        lista.add("Brazil");
        lista.add("Mexico");

        for (int i = 0; i<lista.size(); i++){
            System.out.println("Valor arraylist es: "+ lista.get(i));
        }

        LinkedList<String> linkedList = new LinkedList<>(lista);

        for (int j = 0; j<linkedList.size(); j++){
            System.out.println("Copia de arraylist en linkedlist es: "+ linkedList.get(j));
        }
    }

    public void arraylistRelleno (){
        ArrayList<Integer> arrayList = new ArrayList<>();


        for (int i=0; i <= 10; i++){
            arrayList.add(i);
            System.out.println("Numero añadido: "+ arrayList.get(i));
        }

        for (int j=0; j < arrayList.size(); j++){
            int even= arrayList.get(j)%2;

            if (even == 0){
                System.out.println("Este es un numero par Removido: "+ arrayList.get(j));
                arrayList.remove(j);
            }
        }
        for (int k=0; k < arrayList.size(); k++){
            System.out.println("Numero ArrayList: "+ arrayList.get(k));
        }
        System.out.println("Arraylist Final es: "+ arrayList);
    }
}
