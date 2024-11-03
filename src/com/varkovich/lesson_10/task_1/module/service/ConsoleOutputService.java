package com.varkovich.lesson_10.task_1.module.service;

import com.varkovich.lesson_10.task_1.module.card.Card;
import com.varkovich.lesson_10.task_1.module.client.IndividualClient;
import com.varkovich.lesson_10.task_1.module.utils.AnalyzerClientCardsState;

import java.util.Map;

public class ConsoleOutputService {

    public static void showCardsInformationInConsole(IndividualClient client) {
        AnalyzerClientCardsState clientCardsState = AnalyzerClientCardsService.analyzeClientCards(client.getCards());
        if (clientCardsState == AnalyzerClientCardsState.READY_TO_FINDING_IDENTICAL_CARDS) {
            Map<Card, Integer> identicalCards = FindingIdenticalCardsService.getMapWithIdenticalCards(client.getCards());
            int identicalCardsAmount = FindingIdenticalCardsService.getIdenticalCardsAmount(identicalCards);

            System.out.printf("Name: %s\n", client.getName());
            System.out.println("Client has identical cards: " + identicalCardsAmount);

            for (Map.Entry<Card, Integer> entry : identicalCards.entrySet()) {
                System.out.printf("AMOUNT OF CARDS: %d\ncard number: %s\ncvv: %s\nbalance: %.2f\n---------------------\n"
                        , entry.getValue(), entry.getKey().getCardNumber(), entry.getKey().getCvv(), entry.getKey().getBalance());
            }
        } else {
            System.out.printf("Name: %s\n", client.getName());
            if (clientCardsState != AnalyzerClientCardsState.NO_CARDS) {
                System.out.println(clientCardsState.getCommentary());
                System.out.printf("card number: %s\ncvv: %s\nbalance: %.2f\n", client.getCards()[0].getCardNumber(),
                        client.getCards()[0].getCvv(), client.getCards()[0].getBalance());
            } else {
                System.out.println(clientCardsState.getCommentary());
            }

        }
        System.out.println();
    }
}
