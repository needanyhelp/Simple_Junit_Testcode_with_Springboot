package com.example.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class SUTTest {
    private Calculator calculator;


    @BeforeEach
    void setUp() {
        calculator= new Calculator();
        System.out.println("testing...");
    }

    @DisplayName("10+50")
    @Test
    void testRegularWork() {
        double result = calculator.add(10,50);
        assertEquals(60,result,0);
    }
    @DisplayName("10+70")
    @Test
    void testAdditionalWork() {
        double result = calculator.add(10,70);
        assertEquals(80,result,0);
    }
}