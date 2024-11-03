package com.varkovich.lesson_10.task_1.service;

import com.varkovich.lesson_10.task_1.module.card.Card;
import com.varkovich.lesson_10.task_1.utils.AnalyzerClientCardsState;

public class AnalyzerClientCardsService {

    public static AnalyzerClientCardsState analyzeClientCards(Card[] cards) {
        if (cards == null) {
            return AnalyzerClientCardsState.NO_CARDS;
        }

        if (cards.length == 1) {
            return AnalyzerClientCardsState.ONLY_ONE_CARD;
        }

        return AnalyzerClientCardsState.READY_TO_FINDING_IDENTICAL_CARDS;
    }
}
