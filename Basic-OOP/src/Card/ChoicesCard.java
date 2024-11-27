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

    public HashSet<String> getUniqueChoicesWithHashSet(){
        HashSet<String> uniqueChoices = new HashSet<>(cardChoices);
        return uniqueChoices;
    }

    public List<String> getUniqueChoicesWithLinkedHashSet(){
        Set<String> uniqueChoices= new LinkedHashSet<>(this.cardChoices);
        return new ArrayList<String>(uniqueChoices);
    }

    public void replaceChoice(int index, String newChoice){
        this.cardChoices.set(index, newChoice);
    }
}
