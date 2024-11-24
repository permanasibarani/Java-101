package Service;

import Card.AbstractCard;

public class ValidationService{
    public static void validate(AbstractCard card) throws Throwable {
        if(card.getCardQuestion() == null){
            throw new IllegalArgumentException("Pertanyaan tidak boleh kosong");
        }
    }
}
