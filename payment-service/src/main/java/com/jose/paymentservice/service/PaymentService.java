package com.jose.paymentservice.service;

import com.jose.paymentservice.model.Payment;
import com.jose.paymentservice.resource.Impl.PaymentResourceImpl;
import com.jose.paymentservice.resource.PaymentResource;

public interface PaymentService {
    void sendPayment(Payment payment);
}
