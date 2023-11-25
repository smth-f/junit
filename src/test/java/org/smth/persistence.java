package org.smth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class persistence {
    Solution solution;
    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    //   === !!! ===
    //persistence Tests ->
    @Test
    void zero() {
        int act = solution.persistence(0);
        int exp = 0;
        assertEquals(exp,act);
    }
    @Test
    void oneNaturalNum() {
        int act = solution.persistence(5);
        int exp = 5;
        assertEquals(exp,act);
    }
    @Test
    void naturalNum() {
        int act = solution.persistence(555);
        int exp = 0;
        assertEquals(exp,act);
    }
    @Test
    void naturalNum2() {
        int act = solution.persistence(824);
        int exp = 8;
        assertEquals(exp,act);
    }
    @Test
    void naturalNum3() {
        int act = solution.persistence(664);
        int exp = 6;
        assertEquals(exp,act);
    }
    @Test
    void oneNegativeNum() {
        int act = solution.persistence(-5);
        int exp = -5;
        assertEquals(exp,act);
    }
    @Test
    void negativeNum() {
        int act = solution.persistence(-652);
        int exp = 0;
        assertEquals(exp,act);
    }
    @Test
    void negativeNum2() {
        int act = solution.persistence(-553);
        int exp = -5;
        assertEquals(exp,act);
    }
    @Test
    void negativeNum3() {
        int act = solution.persistence(-44);
        int exp = -6;
        assertEquals(exp,act);
    }
}