package com.example.demo.service;

import com.example.demo.model.Payment;
import com.example.demo.model.Student;

import java.util.List;

public interface PaymentService {
   List<Payment> findAllPayment();
    Payment findPaymentsById(Long id);
    Payment savePayment(Payment p);
    void deletePaymentById(Long id);
    void deleteAll();
    void updatePayment(Payment p);
}
