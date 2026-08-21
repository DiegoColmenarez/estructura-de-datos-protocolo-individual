package org.exercise7;

import java.util.List;

public class Reports {
    private final GetTotalUseCase getTotalUseCase;

    public Reports(GetTotalUseCase getTotalUseCase){
        this.getTotalUseCase = getTotalUseCase;
    }

    public long getTotal(List<SalesLine> salesLineList){
        return getTotalUseCase.calculateTotalSales(salesLineList);
    }
}
