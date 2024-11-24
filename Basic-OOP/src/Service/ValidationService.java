package Service;

import Card.AbstractCard;

public class ValidationService{
    public static void validate(AbstractCard card) {
        if(card.getCardQuestion() == null){
            throw new NullPointerException("Pertanyaan tidak boleh kosong");
        }
    }
}