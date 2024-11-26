package App;

import Card.CardEnum;
import Card.ChoicesCard;

import java.util.Arrays;
import java.util.List;

public class CardApp {
    public static void main(String[] args){
        ChoicesCard card = new ChoicesCard("Foo?", "Bar", CardEnum.ChoicesCard);

        List <String> choices = Arrays.asList("Foo", "Bar", "Nor");
        card.setInitialChoices(choices);
        System.out.println(card.getCardChoices());

        card.replaceChoice(2, "War");
        System.out.println(card.getCardChoices());

        card.getCardChoices().add("Woo");
        System.out.println(card.getCardChoices());

        for(var choice: card.getCardChoices()){
            System.out.println(choice);
        }

        List <String> choice = card.getCardChoices();

        System.out.println(choice.subList(0,2));
    }
}