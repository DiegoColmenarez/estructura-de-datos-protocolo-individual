package org.dynamicStructures;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DinamicListTest {
    List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

    @Test
    void printListTest() {
        assertDoesNotThrow(() -> DinamicList.printList(lista),
                "Debería imprimir la lista sin lanzar excepciones");
    }

    @Test
    void constructorTest(){
        DinamicList dinamicList = new DinamicList(lista);
        assertNotNull(dinamicList, "El objeto no debería ser null");
        assertEquals(lista, dinamicList.getIntegerList(),
                "La lista interna debería ser igual a la original");
    }
}