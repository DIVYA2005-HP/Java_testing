package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void checkEvenNumber(int number) {
        assertTrue(number % 2 == 0);
    }
}
