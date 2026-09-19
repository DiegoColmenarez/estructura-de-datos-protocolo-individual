package org.exercise7;

import java.util.List;

public interface GetBestSellingUseCase {
    List<Product> getBestSelling(List<SalesLine> salesLineList);
}
