package org.exercise7;

import java.util.List;

public interface GetBestSellingUseCase {
    Product getBestSelling(List<SalesLine> salesLineList);
}
