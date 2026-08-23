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

    @Test
    void changeOddNumsListTest() {
        List<Integer> listChange = DinamicList.changeOddNumsList(lista);
        List<Integer> expected = Arrays.asList(0, 2, 0, 4, 0, 6, 0, 8, 0, 0);

        assertNotEquals(lista, listChange, "Las listas deberían ser diferentes si no está vacía");
        assertEquals(expected, listChange, "Los números impares deberían ser 0");
        DinamicList.printList(listChange);
        System.out.println();
    }

    @Test
    void multiplyByIndexListTest() {
        List<Integer> listIndex = DinamicList.multiplyByIndexList(lista);
        List<Integer> expected = Arrays.asList(0, 2, 6, 12, 20, 30, 42, 56, 72, 0);
        assertNotEquals(lista, listIndex, "Las listas deberían ser diferentes si no está vacía");
        assertEquals(expected, listIndex, "Los números deben estar multiplicados por su índice");
        DinamicList.printList(listIndex);
        System.out.println();
    }
}