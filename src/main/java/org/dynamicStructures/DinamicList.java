package org.dynamicStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class DinamicList {
    private List<Integer> integerList = new ArrayList<>();

    public  DinamicList(List<Integer> integerList){
        this.integerList = integerList;
    }

    private List<Integer> transformList(List<Integer> integerList, BiFunction<Integer, Integer, Integer> operation){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            result.add(operation.apply(integerList.get(i), i ));
        }
        return result;
    }
}
