package com.example.restaurants.Entity;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="review_id", nullable=false)
    private long id;

    @Column(name="review")
    private String review;

    @Column(name="grade")
    private double grade;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="restaurant_id")
    private Restaurant restaurant;

    public Review(){}

    public Review(String review, double grade) {
        this.review = review;
        this.grade = grade;
    }

    public long getId() {
        return id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "id=" + id +
                ", review='" + review + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
