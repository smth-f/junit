package org.smth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.smth.Solution;

import static org.junit.jupiter.api.Assertions.*;

class findNextPerfectSquareTest {
    Solution solution;
    @BeforeEach
    void setUp() {
        solution = new Solution();
    }
    //      === !!! ===
    //findNextPerfectSquareTest Tests ->
    @Test
    void trueSQRT() {
        int act = (int) solution.findNextPerfectSquare(64);
        int exp = 81;
        assertEquals(exp,act);
    }
    @Test
    void notPerfectSQRT() {
        int act = (int) solution.findNextPerfectSquare(92);
        int exp = -1;
        assertEquals(exp,act);
    }
    @Test
    void negativeSQRT() {
        int act = (int) solution.findNextPerfectSquare(-64);
        int exp = -1;
        assertEquals(exp,act);
    }
    @Test
    void zero() {
        int act = (int) solution.findNextPerfectSquare(0);
        int exp = 1;
        assertEquals(exp,act);
    }
    @Test
    void longNum() {
        int act = (int) solution.findNextPerfectSquare(678546782);
        int exp = -1;
        assertEquals(exp,act);
    }
    @Test
    void minusOne() {
        int act = (int) solution.findNextPerfectSquare(-1);
        int exp = -1;
        assertEquals(exp,act);
    }
    @Test
    void one() {
        int act = (int) solution.findNextPerfectSquare(1);
        int exp = 4;
        assertEquals(exp,act);
    }
    @Test
    void doubleTest1() {
        int act = (int) solution.findNextPerfectSquare(121.5);
        int exp = -1;
        assertEquals(exp,act);
    }
    @Test
    void doubleTest2() {
        int act = (int) solution.findNextPerfectSquare(144.0);
        int exp = 169;
        assertEquals(exp,act);
    }
    @Test
    void doubleTest3() {
        int act = (int) solution.findNextPerfectSquare(0.0);
        int exp = 1;
        assertEquals(exp,act);
    }
}