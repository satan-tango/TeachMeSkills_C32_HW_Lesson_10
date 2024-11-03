package com.varkovich.lesson_10.task_1.utils;

public enum AnalyzerClientCardsState {
    NO_CARDS("Client does not have cards."),
    ONLY_ONE_CARD("Client has only one card."),
    READY_TO_FINDING_IDENTICAL_CARDS("Client has more then 2 cards, ready to find identical cards.");

    private final String commentary;

    AnalyzerClientCardsState(String commentary) {
        this.commentary = commentary;
    }

    public String getCommentary() {
        return commentary;
    }
}
