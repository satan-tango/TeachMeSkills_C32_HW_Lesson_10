package com.varkovich.lesson_10.task_1.service;

import com.varkovich.lesson_10.task_1.module.card.Card;

import java.util.HashMap;
import java.util.Map;

public class FindingIdenticalCardsService {

    public static Map<Card, Integer> getMapWithIdenticalCards(Card[] cards) {
        Map<Card, Integer> identicalCards = new HashMap<>();
        identicalCards.put(cards[0], 1);

        for (int i = 1; i < cards.length; i++) {
            if (identicalCards.containsKey(cards[i])) {
                identicalCards.put(cards[i], identicalCards.get(cards[i]) + 1);
            } else {
                identicalCards.put(cards[i], 1);
            }
        }

        return identicalCards;
    }

    public static int getIdenticalCardsAmount(Map<Card, Integer> identicalCards) {
        if (identicalCards.isEmpty() || identicalCards == null) {
            return 0;
        }
        int identicalCardsAmount = 0;

        for (Map.Entry<Card, Integer> entry : identicalCards.entrySet()) {
            if (entry.getValue() != 1) {
                identicalCardsAmount += entry.getValue();
            }
        }

        return identicalCardsAmount;
    }
}
