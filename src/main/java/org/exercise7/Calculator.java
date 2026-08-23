package org.exercise7;

import java.util.ArrayList;
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
    public List<Product> getBestSelling(List<SalesLine> salesLineList) {
        int amount = -1;
        List<Product> bestSellersList = new ArrayList<>();
        for (SalesLine salesLine : salesLineList) {
            int currentSales = salesLine.getSalesNum();
            if (currentSales > amount) {
                amount = currentSales;
                bestSellersList.clear();
                bestSellersList.add(salesLine.getProduct());
            } else if (currentSales == amount) {
                bestSellersList.add(salesLine.getProduct());
            }
        }
        return bestSellersList;
    }
}