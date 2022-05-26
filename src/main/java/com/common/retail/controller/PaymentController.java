package com.common.retail.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.common.retail.model.Payment;
import com.common.retail.repository.PaymentRepo;
import com.common.retail.service.PaymentService;
import java.util.Optional;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService service;
	@Autowired
	private PaymentRepo paymentRepo;


	@RequestMapping(value = "/addPayment", method = RequestMethod.POST)
	public Payment addPayment(@RequestBody Payment payment) {
		return service.savePayment(payment);
	}

	@RequestMapping(value = "/addPayments", method = RequestMethod.POST)
	public List<Payment> addPayments(@RequestBody List<Payment> payments) {
		return service.savePayments(payments);
	}

	@RequestMapping(value = "/payments", method = RequestMethod.GET)
	public List<Payment> findAllPayments() {
		return service.getPayments();
	}

	@RequestMapping(value = "/paymentById/{id}", method = RequestMethod.GET)
	public Payment findPaymentById(@PathVariable int id) {
		return service.getPaymentById(id);
	}

	@RequestMapping(value = "/payment/{name}", method = RequestMethod.GET)
	public Payment findProductBypaymentserviceprovider(@PathVariable String name) {
		return service.getpaymentserviceprovider(name);
	}
/*
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Payment updatePayment(@RequestBody Payment payment) {
		return service.updatePayment(payment);
	}
*/
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deletePayment(@PathVariable int id) {
		return service.deletePayment(id);
	}
	
	
	 @PutMapping("update/{id}")
     public ResponseEntity<Payment> update(@PathVariable("id") int id, @RequestBody Payment payment) {
         java.util.Optional<Payment> optionalProject = Optional.of(paymentRepo.findById(id));
         if (optionalProject.isPresent()) {
        	 Payment p = optionalProject.get();
             if (payment.getPaymentserviceprovider() != null)
                 p.setPaymentserviceprovider(payment.getPaymentserviceprovider());
             if (payment.getQuantity() !=0)
                 p.setQuantity(payment.getQuantity());
             if (payment.getTotalpayout() != 0)
                 p.setTotalpayout(payment.getTotalpayout());
             return new ResponseEntity<>(paymentRepo.save(p), HttpStatus.OK);
         } else
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }
}
