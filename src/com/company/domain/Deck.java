package com.company.domain;

import java.util.*;

public class Deck {
    private static final int NUMBER_OF_CARDS_IN_A_DECK = 52;

    private List<Card> deck = new ArrayList<Card>(NUMBER_OF_CARDS_IN_A_DECK);

    public Deck() {
        Collections.addAll(deck, Card.values());
    }

    private Deck(List<Card> deck) {
        this.deck = deck;
    }

    public Deck shuffle() {
        Random randomNumberGenerator = new Random();
        int numberOfCardsShuffled = 0;
        List<Card> copyOfFullDeck = new ArrayList<Card>(deck);
        List<Card> shuffledDeck = new ArrayList<Card>();

        while (numberOfCardsShuffled < NUMBER_OF_CARDS_IN_A_DECK) {
            int randomCard = randomNumberGenerator.nextInt(NUMBER_OF_CARDS_IN_A_DECK);

            if (copyOfFullDeck.get(randomCard) != null) {
                shuffledDeck.add(copyOfFullDeck.get(randomCard));
                copyOfFullDeck.set(randomCard, null);
                numberOfCardsShuffled++;
            }
        }
        return new Deck(shuffledDeck);
    }

    public List<Card> cards() {
        return deck;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Deck{");
        sb.append("deck=").append(deck);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deck deck1 = (Deck) o;

        return !(deck != null ? !deck.equals(deck1.deck) : deck1.deck != null);
    }

    @Override
    public int hashCode() {
        return deck != null ? deck.hashCode() : 0;
    }
}
