package com.caffe.domain.purchase.dto.res;

import com.caffe.domain.payment.dto.PaymentDetailOptionDto;

import java.util.List;

public record PurchasePageResBody(
        List<PurchaseItemInfoDto> purchaseItems,
        List<PaymentDetailOptionDto> paymentOptions
) {
}
