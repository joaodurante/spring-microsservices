package com.joaodurante.hrpayroll.service;

import com.joaodurante.hrpayroll.domain.Payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    
    public Payment getPayment(Long workerId, int days) {
        return new Payment("Joao", 200.0, days);
    }
}
