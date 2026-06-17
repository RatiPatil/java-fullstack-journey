package com.ratikant;

import com.ratikant.junit.GradeCalculator;
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