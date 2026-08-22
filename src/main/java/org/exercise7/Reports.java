package org.exercise7;

import java.util.List;

public class Reports {
    private final GetTotalUseCase getTotalUseCase;
    private final GetBestSellingUseCase getBestSellingUseCase;
    public Reports(GetTotalUseCase getTotalUseCase, GetBestSellingUseCase getBestSellingUseCase){
        this.getTotalUseCase = getTotalUseCase;
        this.getBestSellingUseCase = getBestSellingUseCase;
    }

    public long getTotal(List<SalesLine> salesLineList){
        return getTotalUseCase.calculateTotalSales(salesLineList);
    }

    public List<Product> getBestSellers(List<SalesLine> salesLineList){
        return getBestSellingUseCase.getBestSelling(salesLineList);
    }
}
