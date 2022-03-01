package com.common.retail.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.common.retail.model.Payment;
import com.common.retail.service.PaymentService;


@RestController
public class PaymentController {
	
	@Autowired
    private PaymentService service;

    @PostMapping("/addPayment")
    public Payment addPayment(@RequestBody Payment payment) {
        return service.savePayment(payment);
    }

    @PostMapping("/addPayments")
    public List<Payment> addPayments(@RequestBody List<Payment> payments) {
        return service.savePayments(payments);
    }

    @GetMapping("/payments")
    public List<Payment> findAllPayments() {
        return service.getPayments();
    }

    @GetMapping("/paymentById/{id}")
    public Payment findPaymentById(@PathVariable int id) {
        return service.getPaymentById(id);
    }

    @GetMapping("/payment/{name}")
    public Payment findProductBypaymentserviceprovider(@PathVariable String name) {
        return service.getpaymentserviceprovider(name);
    }

    @PutMapping("/update")
    public Payment updatePayment(@RequestBody Payment payment) {
        return service.updatePayment(payment);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePayment(@PathVariable int id) {
        return service.deletePayment(id);
    }

}
