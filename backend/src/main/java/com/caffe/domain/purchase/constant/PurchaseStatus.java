package com.caffe.domain.purchase.constant;

public enum PurchaseStatus {
    TEMPORARY, // 결제 전 임시 저장
    PURCHASED, // 주문 완료 (결제 완료)
    CANCELED,  // 주문 취소
    FAILED,     // 주문 중 오류 발생
    ORDERED
}
