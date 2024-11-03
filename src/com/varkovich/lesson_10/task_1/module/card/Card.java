package com.varkovich.lesson_10.task_1.module.card;

import java.util.Objects;

public class Card {

    private String cardNumber;

    private String cvv;

    private double balance;

    public Card(String cardNumber, String cvv, double balance) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardNumber, card.cardNumber) && Objects.equals(cvv, card.cvv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cvv);
    }
}
