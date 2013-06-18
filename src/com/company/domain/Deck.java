package com.company.domain;

import java.util.*;

public class Deck {
    private List<Card> deck = new ArrayList<Card>();

    public Deck() {
        Collections.addAll(deck, Card.values());
    }

    public Deck shuffle() {
        Collections.shuffle(deck);
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Deck{");
        sb.append("deck=").append(deck);
        sb.append('}');
        return sb.toString();
    }
}
