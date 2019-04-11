package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class PaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @OneToMany
    @JoinColumn(name = "id")
    private Student student;
    private LocalDateTime time;
    private double sum;
    private String isPayed;

    public PaymentModel(Long id, Student student, LocalDateTime time, double sum, String isPayed) {
        this.id = id;
        this.student = student;
        this.time = time;
        this.sum = sum;
        this.isPayed = isPayed;
    }

    public PaymentModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(String isPayed) {
        this.isPayed = isPayed;
    }
}
