package Card;

public abstract class AbstractCard {
    private String cardQuestion;
    private String cardAnswer;

    public AbstractCard(String cardQuestion, String cardAnswer) {
        this.cardQuestion = cardQuestion;
        this.cardAnswer = cardAnswer;
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
}
