package org.smth;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmthTest {
    Smth smth;
    @BeforeEach
    void setUp() {
        smth = new Smth();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void increment() {
        int actual = smth.increment(1);
        int exp = 2;
        assertEquals(exp,actual);
    }

    @Test
    void increment2() {
        int actual = smth.increment(156);
        int exp = 157;
        assertEquals(exp,actual);
    }

    @Test
    void increment3() {
        int actual = smth.increment(4566);
        int exp = 4567;
        assertEquals(exp,actual);
    }

    @Test
    void incrementZero() {
        int actual = smth.increment(0);
        int exp = 1;
        assertEquals(exp,actual);
    }

    @Test
    void incrementMinus() {
        int actual = smth.increment(-1);
        int exp = 0;
        assertEquals(exp,actual);
    }

    @Test
    void incrementMinus2() {
        int actual = smth.increment(-55);
        int exp = -54;
        assertEquals(exp,actual);
    }

    @Test
    void incrementMinus3() {
        int actual = smth.increment(-54887);
        int exp = -54886;
        assertEquals(exp,actual);
    }
}