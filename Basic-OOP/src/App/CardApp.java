package App;

import Card.AbstractCard;
import Card.BasicCard;
import Card.CardEnum;
import Card.ChoicesCard;
import Service.ValidationService;

import java.util.List;

public class CardApp {
    public static void main(String[] args){
        ChoicesCard card = new ChoicesCard("Foo?", "Bar", CardEnum.ChoicesCard);

        card.setCardChoices(new String[]{"Wow", "Wew", "Wuw"});
        System.out.println(card.getStringCardChoices());
    }
}