package pl.codeleak.samples.unit_testing.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        // arrange environment
        fizzBuzz= new FizzBuzz();
    }

    @Test
    @DisplayName("Should return 'Fizz' when given number is divisible 3")
    void returnsFizzWhenGivenIsDisableBy3() {

        String result = fizzBuzz.play(3);

        // assert -sprawdz
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("Should return 'Fizz' when given number is divisible 5")
    void returnsBuzzWhenGivenIsDisableBy5() {

        //act
        String result = fizzBuzz.play(5);

        // assert -sprawdz
        assertEquals("Buzz", result);
    }
    @Test
    @DisplayName("Should return 'Fizz' when given number is divisible 5 and 3")
    void returnsFizzBuzzWhenGivenIsDisableBy35() {

        //act
        String result = fizzBuzz.play(5 * 3);

        // assert -sprawdz
        assertEquals("FizzBuzz", result);
    }

    @Test
    @DisplayName("Should return return as String when given number is not  divisible 5 and 3")
    void returnsStringWhenGivenIsDisableBy3() {

        //act
        String result = fizzBuzz.play(1);

        // assert -sprawdz
        assertEquals("1", result);
    }
}