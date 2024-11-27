package App;

import Card.CardEnum;
import Card.ChoicesCard;

import java.util.Arrays;
import java.util.List;

public class CardApp {
    public static void main(String[] args){
        ChoicesCard card = new ChoicesCard("Foo?", "Bar", CardEnum.ChoicesCard);

        List <String> choices = Arrays.asList("Foo", "Bar", "Nor", "Bar", "Goo", "Foo");
        card.setInitialChoices(choices);
        System.out.println(card.getUniqueChoicesWithHashSet());
        System.out.println(card.getUniqueChoicesWithLinkedHashSet());
    }
}