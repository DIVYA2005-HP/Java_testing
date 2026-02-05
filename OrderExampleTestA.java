package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OrderExampleTestA {
    @Test
    @Order(1)
    void firstTest()
    {
        System.out.println("First Test");
    }
    @Test
    @Order(2)
    void SecondTest()
    {
        System.out.println("Second Test");
    }

    @Test
    @Order(3)
    void ThirdTest()
    {
        System.out.println("Second Test");
    }

}
