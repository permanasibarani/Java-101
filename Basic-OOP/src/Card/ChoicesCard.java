package Card;

import java.util.ArrayList;
import java.util.List;

public class ChoicesCard extends AbstractCard {
    private String[] cardChoices;

    public ChoicesCard(String cardQuestion, String cardAnswer, CardEnum cardType) {
        super(cardQuestion, cardAnswer, cardType);
    }

    public String[] getCardChoices() {
        return cardChoices;
    }

    public void setCardChoices(String[] cardChoices) {
        this.cardChoices = cardChoices;
    }

    public String getStringCardChoices(){
        Iterable<String> card = List.of(this.cardChoices);

        StringBuilder cardList = new StringBuilder();

        for (var item:card){
            cardList.append(item);
        }
        return cardList.toString();
    }

    public String stringChoices(){

        List<String> card = new ArrayList<>();

        for(var i =0; i < this.cardChoices.length; i++){
            card.add(this.cardChoices[i]);
        }
        card.removeLast();
        return card.toString();
    }
}
