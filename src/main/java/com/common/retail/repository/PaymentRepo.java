package com.common.retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.common.retail.model.Payment;
import com.google.common.base.Optional;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Integer> {
    Payment findBypaymentserviceprovider(String paymentserviceprovider);

//	Optional<Payment> findById(int id); 
    
    Payment findById(int id); 

}
