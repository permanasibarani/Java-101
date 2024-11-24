package App;

import Card.AbstractCard;
import Card.BasicCard;
import Card.CardEnum;
import Service.ValidationService;

public class CardApp {
    public static void main(String[] args){
        AbstractCard card = new BasicCard(null, "Foo", CardEnum.BasicCard);
        try {
            ValidationService.validate(card);
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
    }
}