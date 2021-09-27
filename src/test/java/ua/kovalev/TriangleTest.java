package ua.kovalev;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TriangleTest {
    private Triangle triangle;
    private double expectedHalPerimeter;
    private double expectedSquare;

    @BeforeAll
    void setUp(){
        triangle = new Triangle(5.7, 7.4, 4.5);
        expectedHalPerimeter = 8.8;
        expectedSquare = 12.815;
    }

    @Test
    void testGetSquare() {
        assertEquals(expectedSquare, triangle.getSquare());
    }

    @Test
    void testGetHalfPerimeter(){
        assertEquals(expectedHalPerimeter, triangle.getHalfPerimeter());
    }
}