package com.varkovich.lesson_10.task_1;

import com.varkovich.lesson_10.task_1.module.card.Card;
import com.varkovich.lesson_10.task_1.module.client.IndividualClient;
import com.varkovich.lesson_10.task_1.module.service.AnalyzerClientCardsService;
import com.varkovich.lesson_10.task_1.module.service.ConsoleOutputService;
import com.varkovich.lesson_10.task_1.module.service.FindingIdenticalCardsService;
import com.varkovich.lesson_10.task_1.module.utils.AnalyzerClientCardsState;

import java.util.Map;

/**
 * Есть клиент.
 * Клиент может иметь любое количество карт.
 * Карта имеет три поля - cvv-код, номер карты и сумма на карте.
 * Вывести на экран сообщение о том, сколько одинаковых карты имеет клиент.
 * Поле со значением суммы на карте не должно участвовать в сравнении.
 * Т.е. две краты с одними и теми же cvv-кодами и номерами, но разными суммами
 * считаются одинаковыми. Предусмотреть различные варианты выходного сообщения
 * - например, у клиента нет ни одной карты совсем, у клиента нет одинаковых карт
 * и другие возможные ситуации.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        IndividualClient firstClient = new IndividualClient("Dmitry", new Card[]{
                new Card("3434-3434-1111-0000", "234", 50)
        });
        IndividualClient secondClient = new IndividualClient("Pavel",null);
        IndividualClient thirdClient = new IndividualClient("Andrei", new Card[]{
                new Card("3434-3434-1111-0000", "234", 50),
                new Card("3434-3434-1111-0000", "234", 50),
                new Card("3535-3333-0000-1241", "999", 10),
                new Card("3535-3333-0000-1241", "999", 10),
                new Card("3535-3333-0000-1241", "999", 10),
                new Card("3535-3333-0000-1241", "999", 10),
                new Card("1211-0002-3111-3455", "013", 100000),
        });

        ConsoleOutputService.showCardsInformationInConsole(firstClient);
        ConsoleOutputService.showCardsInformationInConsole(secondClient);
        ConsoleOutputService.showCardsInformationInConsole(thirdClient);

    }
}
