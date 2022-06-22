package com.example.imperial;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ImperialApplicationTests {
    //sut = system under test
    Implementation sut = new Implementation();
    @Test
    public void stoneToKilogram()
    {
        var result = sut.stoneToKilogram(1);

        var expected = 6.35;

        assertEquals(expected, result);
    }

}
