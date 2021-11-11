package com.joaodurante.hrpayroll.service;

import java.util.HashMap;
import java.util.Map;

import com.joaodurante.hrpayroll.domain.Payment;
import com.joaodurante.hrpayroll.domain.Worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${hr-worker.host}")
    String HR_WORKER_HOST;
    
    public Payment getPayment(Long workerId, int days) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", workerId.toString());

        Worker worker = restTemplate.getForObject(HR_WORKER_HOST + "/worker/{id}", Worker.class, uriVariables);

        return new Payment(worker.getName(), worker.getDailySalary(), days);
    }
}
