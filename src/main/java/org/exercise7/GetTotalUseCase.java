package org.exercise7;

import java.util.List;

public interface GetTotalUseCase{

    long calculateTotalSales(List<SalesLine> salesLineList);
}
