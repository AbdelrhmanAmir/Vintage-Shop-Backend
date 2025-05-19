package com.vintageshop.ecommerce.dto;

import com.vintageshop.ecommerce.entity.Address;
import com.vintageshop.ecommerce.entity.Customer;
import com.vintageshop.ecommerce.entity.Order;
import com.vintageshop.ecommerce.entity.OrderItem;
import lombok.Data;
import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
