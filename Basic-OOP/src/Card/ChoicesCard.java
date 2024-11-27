package Card;

import java.util.*;

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

    public HashSet<String> getUniqueChoices(){
        HashSet<String> uniqueChoices = new HashSet<>(cardChoices);
        return uniqueChoices;
    }

    public void replaceChoice(int index, String newChoice){
        this.cardChoices.set(index, newChoice);
    }
}
