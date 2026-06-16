package com.ratikant.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeCalculatorTest {

    GradeCalculator gradeCalculator =
            new GradeCalculator();

    @Test
    public void testGradeA() {
        assertEquals("A", gradeCalculator.calculateGrade(95));
    }
}