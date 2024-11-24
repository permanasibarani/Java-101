package Card;

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
}
