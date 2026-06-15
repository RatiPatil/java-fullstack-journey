package com.ratikant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeCalculatorTest {

    GradeCalculator gradeCalculator =
            new GradeCalculator();

    @Test
    public void testGradeA() {
        assertEquals("A",
                gradeCalculator.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B",
                gradeCalculator.calculateGrade(80));
    }

    @Test
    public void testGradeC() {
        assertEquals("C",
                gradeCalculator.calculateGrade(65));
    }

    @Test
    public void testGradeD() {
        assertEquals("D",
                gradeCalculator.calculateGrade(40));
    }

    @Test
    public void testFail() {
        assertEquals("Fail",
                gradeCalculator.calculateGrade(20));
    }
}