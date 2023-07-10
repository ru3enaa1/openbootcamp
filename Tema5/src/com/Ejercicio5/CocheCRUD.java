package com.Ejercicio5;

import java.util.List;

public interface CocheCRUD {

    Coche save(Coche coche);
    List <Coche> findAll();
    Coche delete(Coche coche);

}
