package com.company.domain;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertNotSame;

public class DeckTest {

    @Test
    public void shuffleCards() throws Exception {
        Deck deck = new Deck();
        Deck savedOriginalDeck = new Deck();
        Collections.copy(savedOriginalDeck.cards(), deck.cards());

        Deck shuffle = deck.shuffle();
        assertNotSame(shuffle, savedOriginalDeck);
    }
}
