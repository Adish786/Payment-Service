package com.common.retail.service;

import java.util.List;
import java.util.Optional;

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
	        return repository.findById(id);
	    }

	    public Payment getpaymentserviceprovider(String name) {
	        return repository.findBypaymentserviceprovider(name);
	    }

	    public String deletePayment(int id) {
	        repository.deleteById(id);
	        return "Payment removed !! " + id;
	    }
	    
	    /*
	    @Transactional
	    public Payment updatePayment(Payment payment) {
	    	Payment existingPayment = repository.findById(payment.getId()).orElse(null);
	    	existingPayment.setId(payment.getId());
	    	existingPayment.setPaymentserviceprovider(payment.getPaymentserviceprovider());
	    	existingPayment.setQuantity(payment.getQuantity());
	    	existingPayment.setTotalpayout(payment.getTotalpayout());
	        return repository.save(existingPayment);
	    }
	    */
   
/*	    
	    public Payment updatePayment(Payment payment) {
	    	Payment outPayment = null;

	        if (payment.getPaymentserviceprovider() != null && payment.getQuantity() > 0) {
	        	Payment existingPayment = repository.findById(payment.getId()).orElse(null);
	        	existingPayment.setQuantity(payment.getQuantity());
	        	existingPayment.setPaymentserviceprovider(payment.getPaymentserviceprovider());
	            outPayment = repository.save(existingPayment);
	        } else if (payment.getQuantity() > 0 && payment.getTotalpayout() > 0) {
	        	Payment existingPayment = repository.findById(payment.getId()).orElse(null);
	        	existingPayment.setQuantity(payment.getQuantity());
	        	existingPayment.setTotalpayout(payment.getTotalpayout());
	            outPayment = repository.save(existingPayment);
	        }else if (payment.getTotalpayout() != 0 && payment.getPaymentserviceprovider() != null) {
	        	Payment existingPayment = repository.findById(payment.getId()).orElse(null);
	        	existingPayment.setTotalpayout(payment.getTotalpayout());
	        	existingPayment.setPaymentserviceprovider(payment.getPaymentserviceprovider());
	            outPayment = repository.save(existingPayment);
	        } else if (payment.getPaymentserviceprovider() != null) {
	        	Payment existingPayment = repository.findById(payment.getId()).orElse(null);
	        	existingPayment.setPaymentserviceprovider(payment.getPaymentserviceprovider());
	            outPayment = repository.save(existingPayment);
	        } else if (payment.getQuantity() > 0) {
	        	Payment existingPayment = repository.findById(payment.getId()).orElse(null);
	        	existingPayment.setQuantity(payment.getQuantity());
	            outPayment = repository.save(existingPayment);
	        }   else if (payment.getTotalpayout() != 0) {
	        	Payment existingPayment = repository.findById(payment.getId()).orElse(null);
	        	existingPayment.setTotalpayout(payment.getTotalpayout());
	            outPayment = repository.save(existingPayment);
	        } 
	        return outPayment;
	    }

	*/    
}
