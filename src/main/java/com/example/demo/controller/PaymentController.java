package com.example.demo.controller;

import com.example.demo.model.Payment;
import com.example.demo.model.Student;
import com.example.demo.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(com.example.demo.controller.PaymentController.URL_PAYMENT)
public class PaymentController {

    public static final String URL_PAYMENT = "/api/v1/payment";

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @GetMapping
    public List<Payment> getPayment() {
        return this.paymentService.findAllPayment();
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return this.paymentService.findPaymentsById(id);
    }

    @PostMapping
    public Payment savePayment(@RequestBody Payment p) {
        return this.paymentService.savePayment(p);
    }

    @DeleteMapping("/{id}")
    public void deletePaymentById(@PathVariable long id) {
        paymentService.deletePaymentById(id);
        System.out.println("Удалено!");
    }

    @DeleteMapping()
    public void deleteAll() {
        paymentService.deleteAll();
    }

    @PutMapping()
    public void updateStudent(@RequestBody Payment p) {
        this.paymentService.updatePayment(p);
    }

}
