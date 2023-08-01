package com.jose.paymentservice.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.jose.paymentservice.model.Payment;

public interface PaymentResource {
    @PostMapping
    ResponseEntity<Payment> payment(@RequestBody Payment payment);
}
