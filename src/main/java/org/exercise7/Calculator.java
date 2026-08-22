package org.exercise7;

import java.util.List;

public class Calculator implements GetTotalUseCase, GetBestSellingUseCase{

    @Override
    public long calculateTotalSales(List<SalesLine> salesLineList) {
        long total = 0;
        for (SalesLine salesLine : salesLineList){
            total += salesLine.getLineTotal();
        }
        return total;
    }

    @Override
    public String getBestSelling(List<SalesLine> salesLineList) {
      return null;
    }
}
