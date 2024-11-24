package Card;

public abstract class AbstractCard {
    private CardEnum cardType;
    private String cardQuestion;
    private String cardAnswer;

    public AbstractCard(String cardQuestion, String cardAnswer, CardEnum cardType) {
        this.cardQuestion = cardQuestion;
        this.cardAnswer = cardAnswer;
        this.cardType = cardType;
    }

    public String getCardQuestion() {
        return cardQuestion;
    }

    public void setCardQuestion(String cardQuestion) {
        this.cardQuestion = cardQuestion;
    }

    public String getCardAnswer() {
        return cardAnswer;
    }

    public void setCardAnswer(String cardAnswer) {
        this.cardAnswer = cardAnswer;
    }

    public CardEnum getCardType() {
        return cardType;
    }

    public void setCardType(CardEnum cardType) {
        this.cardType = cardType;
    }
}
