package thirdtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @BeforeAll
    static void init() {
        System.out.println("In before all");
    }

    @BeforeEach
    void beforeeach() {
        System.out.println("Before each test");
    }

    @Test
    void test() {
        BankAccount account = new BankAccount();
        int actual = account.withdraw(2000);
        int expectedResult = 3000;
        assertEquals(expectedResult, actual);
    }
}
