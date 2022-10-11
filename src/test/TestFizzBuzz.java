package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.FizzBuzz;

class TestFizzBuzz {

	@Test
    void fizzBuzztest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        // Arrange
        int input = 1;
        String expected = "1";
        // Act
        String actual = fizzBuzz.fizzBuzz(input);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzztest2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 3;
        String expected = "Fizz";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }
    @Test
    void fizzBuzztest3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 5;
        String expected = "Buzz";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }
    @Test
    void fizzBuzztest4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 6;
        String expected = "Fizz";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void fizzBuzztest5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 15;
        String expected = "FizzBuzz";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }
    @Test
    void fizzBuzztest6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 18;
        String expected = "Fizz";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzztest7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 20;
        String expected = "Buzz";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzztest8() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 21;
        String expected = "Fizz";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }
    @Test
    void fizzBuzztest9() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 30;
        String expected = "FizzBuzz";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }
    @Test
    void fizzBuzztest10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 31;
        String expected = "31";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }
    @Test
    void fizzBuzztest11() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 33;
        String expected = "Fizz";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }
    @Test
    void fizzBuzztest12() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 35;
        String expected = "Buzz";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }
	@Test
    void fizzBuzztest13() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 95;
        String expected = "Buzz";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }
	@Test
    void fizzBuzztest14() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 98;
        String expected = "98";
        String actual = fizzBuzz.fizzBuzz(input);
        assertEquals(expected, actual);
    }
}

