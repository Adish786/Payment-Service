package com.common.retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.common.retail.model.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Integer> {
    Payment findBypaymentserviceprovider(String paymentserviceprovider); 

}
