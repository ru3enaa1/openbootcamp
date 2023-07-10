package com.Ejercicio5;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        Coche chanaBenni = new Coche(4, "Chana Benni", "Silver", false);


        cocheCRUD.save(new Coche(4, "Chana Benni", "Silver", false));
        cocheCRUD.findAll();
        cocheCRUD.delete(new Coche());

        System.out.println("Chana Benni: "+cocheCRUD.save(chanaBenni));
        System.out.println("cocheCRUD.save: " +cocheCRUD.save(new Coche(2, "Ferrari", "Red", true)));
        System.out.println("cocheCRUD.findAll: " +cocheCRUD.findAll());
        System.out.println("cocheCRUD.delete: " +cocheCRUD.delete(new Coche()));











    }
}
