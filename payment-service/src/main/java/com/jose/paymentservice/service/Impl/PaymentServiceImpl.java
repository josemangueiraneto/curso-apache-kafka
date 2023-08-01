package com.jose.paymentservice.service.Impl;


import com.jose.paymentservice.service.PaymentService;
import com.jose.paymentservice.model.Payment;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment){
        log.info("PAYMENT_SERVICE_IMPL : Recebi o pagamento {}", payment);



    }

}
