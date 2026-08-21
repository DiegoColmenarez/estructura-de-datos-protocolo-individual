package org.exercise7;

import java.util.List;

public class Reports {
    private final GetTotalUseCase getTotalUseCase;

    public Reports(GetTotalUseCase getTotalUseCase){
        this.getTotalUseCase = getTotalUseCase;
    }

    public long calulateTotalSales(List<SalesLine> salesLineList){
        return getTotalUseCase.getTotal(salesLineList);
    }
}
