package com.caffe.domain.purchase.dto.res;

import com.caffe.domain.product.entity.Product;
import com.caffe.domain.purchase.entity.PurchaseItem;

public record PurchaseItemDto(
        int purchaseItemId,
        int quantity,
        int price,
        String productName
) {
    public PurchaseItemDto(PurchaseItem purchaseItem, Product product) {
        this(
                purchaseItem.getId(),
                purchaseItem.getQuantity(),
                purchaseItem.getPrice(),
                product.getProductName()
        );
    }
}
