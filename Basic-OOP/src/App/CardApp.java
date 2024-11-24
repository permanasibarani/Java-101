package App;

import Card.AbstractCard;
import Card.BasicCard;
import Card.CardEnum;

public class CardApp {
    public static void main(String[] args){

        AbstractCard card = new BasicCard("Who are you?", "Foo", CardEnum.BasicCard);
    }
}
