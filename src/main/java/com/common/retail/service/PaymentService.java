package com.common.retail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.retail.model.Payment;
import com.common.retail.repository.PaymentRepo;

@Service
public class PaymentService {
	
	 @Autowired
	    private PaymentRepo repository;

	    public Payment savePayment(Payment payment) {
	        return repository.save(payment);
	    }

	    public List<Payment> savePayments(List<Payment> payments) {
	        return repository.saveAll(payments);
	    }

	    public List<Payment> getPayments() {
	        return repository.findAll();
	    }

	    public Payment getPaymentById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Payment getpaymentserviceprovider(String name) {
	        return repository.findBypaymentserviceprovider(name);
	    }

	    public String deletePayment(int id) {
	        repository.deleteById(id);
	        return "Payment removed !! " + id;
	    }

	    public Payment updatePayment(Payment payment) {
	    	Payment existingPayment = repository.findById(payment.getId()).orElse(null);
	    	existingPayment.setId(payment.getId());
	    	existingPayment.setPaymentserviceprovider(payment.getPaymentserviceprovider());
	    	existingPayment.setQuantity(payment.getQuantity());
	    	existingPayment.setTotalpayout(payment.getTotalpayout());
	        return repository.save(existingPayment);
	    }


}
