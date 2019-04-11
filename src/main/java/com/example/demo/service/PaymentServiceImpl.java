package com.example.demo.service;

import com.example.demo.model.Payment;
import com.example.demo.model.Student;
import com.example.demo.repository.PaymentRep;
import com.example.demo.repository.StudRep;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {
    private final PaymentRep paymentRep;


    public PaymentServiceImpl(PaymentRep paymentRep) {
        this.paymentRep = paymentRep;
    }

    @Override
    public List<Payment> findAllPayment() {
        return this.paymentRep.findAll();
    }

    @Override
    public Payment findPaymentsById(Long id) {
        return this.paymentRep.findById(id).get();
    }

    @Override
    public Payment savePayment(Payment p) {
        return this.paymentRep.save(p);
    }

    @Override
    public void deletePaymentById(Long id) {
        this.paymentRep.deleteById(id);
    }

    @Override
    public void deleteAll() {
        this.paymentRep.deleteAll();
    }

    @Override
    public void updatePayment(Payment p) {
        this.paymentRep.save(p);
    }
}
