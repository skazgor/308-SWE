package com.company;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testDriver {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Unit testing using Junit");
    }

    @Test
    public void testEachGrade(){
        System.out.println("Testing each Grade");
        assertEquals("F",GradeCalculation.gradeCalculation("45", GradeCalculation.credit.three));
        assertEquals("C",GradeCalculation.gradeCalculation("195", GradeCalculation.credit.three));
        assertEquals("B",GradeCalculation.gradeCalculation("235", GradeCalculation.credit.three));
        assertEquals("A",GradeCalculation.gradeCalculation("245", GradeCalculation.credit.three));
        assertEquals("F",GradeCalculation.gradeCalculation("45", GradeCalculation.credit.four));
        assertEquals("C",GradeCalculation.gradeCalculation("255", GradeCalculation.credit.four));
        assertEquals("B",GradeCalculation.gradeCalculation("285", GradeCalculation.credit.four));
        assertEquals("A",GradeCalculation.gradeCalculation("345", GradeCalculation.credit.four));
    }
    @Test
    public void testBoundary(){
        System.out.println("Testing Boundary Values");
        assertEquals("F",GradeCalculation.gradeCalculation("0", GradeCalculation.credit.three));
        assertEquals("F",GradeCalculation.gradeCalculation("179", GradeCalculation.credit.three));
        assertEquals("C",GradeCalculation.gradeCalculation("209", GradeCalculation.credit.three));
        assertEquals("B",GradeCalculation.gradeCalculation("239", GradeCalculation.credit.three));
        assertEquals("A",GradeCalculation.gradeCalculation("300", GradeCalculation.credit.three));
        assertEquals("F",GradeCalculation.gradeCalculation("0", GradeCalculation.credit.four));
        assertEquals("F",GradeCalculation.gradeCalculation("239", GradeCalculation.credit.four));
        assertEquals("C",GradeCalculation.gradeCalculation("279", GradeCalculation.credit.four));
        assertEquals("B",GradeCalculation.gradeCalculation("319", GradeCalculation.credit.four));
        assertEquals("A",GradeCalculation.gradeCalculation("400", GradeCalculation.credit.four));
    }
    @Test
    public void testRound(){
        System.out.println("Testing Round value");
        assertEquals("B",GradeCalculation.gradeCalculation("239.45", GradeCalculation.credit.three));
        assertEquals("A",GradeCalculation.gradeCalculation("239.55", GradeCalculation.credit.three));
        assertEquals("B",GradeCalculation.gradeCalculation("319.45", GradeCalculation.credit.four));
        assertEquals("A",GradeCalculation.gradeCalculation("319.55", GradeCalculation.credit.four));
    }
    @Test
    public void testRange(){
        System.out.println("Test Range of valid NUmber");
        assertEquals("Invalid Number",GradeCalculation.gradeCalculation("-44", GradeCalculation.credit.three));
        assertEquals("Invalid Number",GradeCalculation.gradeCalculation("4440.4", GradeCalculation.credit.three));
        assertEquals("Invalid Number",GradeCalculation.gradeCalculation("-44", GradeCalculation.credit.four));
        assertEquals("Invalid Number",GradeCalculation.gradeCalculation("4440.4", GradeCalculation.credit.four));
    }
    @Test
    public void testInvalid(){
        System.out.println("Test For invalid number");
        assertEquals("Non Number input",GradeCalculation.gradeCalculation("abc", GradeCalculation.credit.three));
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Done with unit testing using Junit");
    }

}
