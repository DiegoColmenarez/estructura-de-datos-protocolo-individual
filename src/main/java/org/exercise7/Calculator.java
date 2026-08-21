package org.exercise7;

import java.util.List;

public class Calculator implements GetTotalUseCase{

    @Override
    public long getTotal(List<SalesLine> salesLineList) {
        long total = 0;
        for (SalesLine salesLine : salesLineList){
            total += salesLine.getLineTotal();
        }
        return total;
    }
}
