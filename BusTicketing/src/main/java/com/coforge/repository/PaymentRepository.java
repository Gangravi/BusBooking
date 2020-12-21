package com.coforge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.model.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
