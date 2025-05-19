package com.vintageshop.ecommerce.service;

import com.vintageshop.ecommerce.dto.Purchase;
import com.vintageshop.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
