package com.varkovich.lesson_10.task_1.module.client;

import com.varkovich.lesson_10.task_1.module.card.Card;

public class IndividualClient {

    private String name;

    private Card[] cards;

    public IndividualClient(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
}
