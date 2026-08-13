package org.Staticstructures;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ListStaticTest {
    int[] vector = new int[]{1,2,3,4,5,6,7,8,9,0};

    @Test
    void printVectorTest(){
         ListStatic.printVector(vector);
         ListStatic.printWithFor(vector);
         ListStatic.printVectorForEach(vector);
    }

    @Test
    void constructorTest() {
        ListStatic listStatic = new ListStatic(vector);
        assertNotNull(listStatic, "El objeto no debería ser null");
        assertArrayEquals(vector, listStatic.getListNums(),
                "El array debería ser igual al original");
    }

    @Test
    void emptyArrayTest() {
        int[] emptyArray = new int[0];
        assertDoesNotThrow(() -> ListStatic.printVector(emptyArray),
                "Debería manejar array vacío sin error");
        assertDoesNotThrow(() -> ListStatic.printWithFor(emptyArray),
                "Debería manejar array vacío sin error");
    }


}