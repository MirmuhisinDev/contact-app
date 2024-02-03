package card_project;

import java.util.Arrays;

public class User {
    private Long id;
    private String  fullName;
    private Card[] cards= new Card[5];

    public User(Long id, String fullName, Card[] cards) {
        this.id = id;
        this.fullName = fullName;
        this.cards = cards;
    }
    public User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", cards=" + Arrays.toString(cards) +
                '}';
    }
}
