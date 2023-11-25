package org.smth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class findShortTest {
    Solution solution;
    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    //   === !!! ===
    //findShort Tests ->
    @Test
    void coupleOfWords1() {
        int act = (int) solution.findShort("Couple Of Words");
        int exp = 2;
        assertEquals(exp,act);
    }
    @Test
    void coupleOfWords2() {
        int act = (int) solution.findShort("Hello Code");
        int exp = 4;
        assertEquals(exp,act);
    }
    @Test
    void coupleOfWords3() {
        int act = (int) solution.findShort("The Cat Is Amazing");
        int exp = 2;
        assertEquals(exp,act);
    }
    @Test
    void nullStr() {
        int act = (int) solution.findShort(null);
        int exp = 0;
        assertEquals(exp,act);
    }
    @Test
    void empty() {
        int act = (int) solution.findShort("");
        int exp = 0;
        assertEquals(exp,act);
    }
    @Test
    void empty2() {
        int act = (int) solution.findShort(" ");
        int exp = 0;
        assertEquals(exp,act);
    }
    @Test
    void nums() {
        int act = (int) solution.findShort("213 2");
        int exp = 1;
        assertEquals(exp,act);
    }
    @Test
    void upperCase() {
        int act = (int) solution.findShort("HELLO CODE");
        int exp = 4;
        assertEquals(exp,act);
    }
    @Test
    void lowerCase() {
        int act = (int) solution.findShort("hello code");
        int exp = 4;
        assertEquals(exp,act);
    }
    @Test
    void randomCase() {
        int act = (int) solution.findShort("hElLo CoDe");
        int exp = 4;
        assertEquals(exp,act);
    }
    @Test
    void symbols() {
        int act = (int) solution.findShort("%@#");
        int exp = 3;
        assertEquals(exp,act);
    }
    @Test
    void symbolsWithWords() {
        int act = (int) solution.findShort("%HeLLO@ Code#");
        int exp = 5;
        assertEquals(exp,act);
    }
    @Test
    void symbolsWithUpperCaseWords() {
        int act = (int) solution.findShort("%HELLO@ CODE#");
        int exp = 5;
        assertEquals(exp,act);
    }
    @Test
    void symbolsWithLowerCaseWords() {
        int act = (int) solution.findShort("%hello@ code#");
        int exp = 5;
        assertEquals(exp,act);
    }
}