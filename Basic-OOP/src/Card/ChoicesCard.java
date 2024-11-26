package Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ChoicesCard extends AbstractCard {
    private List<String> cardChoices;

    public ChoicesCard(String cardQuestion, String cardAnswer, CardEnum cardType) {
        super(cardQuestion, cardAnswer, cardType);
        this.cardChoices = new ArrayList<>();
    }

    public List<String> getCardChoices(){
        return this.cardChoices;
    }

    public void setInitialChoices(List<String> choices){
        this.cardChoices.addAll(choices);
    }
}
