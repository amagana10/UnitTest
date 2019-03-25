package com.example.unittest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)

public class StringUtilTest {

    Student mockStudent;

    @Before
    public void setup(){
        mockStudent = mock(Student.class);
        Mockito.when(mockStudent.getStudentName()).thenReturn("Bob");
    }

    @Test
    public void testconcatTwoStrings(){
        final String one = "test";
        final String two = "method";
        final String expectedResult = one + " "+two;

        assertEquals(expectedResult, StringUtil.concatTwoStrings(one,two));

    }


    @Test
    public void testStringIsGreaterThanFiveTrue(){
        assertTrue(StringUtil.stringLengthGreaterThanFive("123456"));
    }
    @Test
    public void testStringIsGreaterThanFiveFalse(){
        assertFalse(StringUtil.stringLengthGreaterThanFive("123"));
    }

    @Test
    public void testReturnString_Null(){
        String testString = null;
        assertNull(StringUtil.returnString(testString));
    }
    @Test
    public void testReturnString_NonNull(){
        String testString = "I have a value";
        assertNotNull(StringUtil.returnString(testString));

    }

    @Test
    public void testProcessStudent(){
        final String middleText = " has a gpa of ";
        final String mockGpaValue = "3.8";
        final String expectedResult = "Bob"+middleText+mockGpaValue;

        Mockito.when(mockStudent.getStudentGPA()).thenReturn(mockGpaValue);

        assertEquals(expectedResult,StringUtil.processStudent(mockStudent));

    }

    @Test
    public void  testProcessStudentGPA(){
        StringUtil.processGpa(mockStudent);
        Mockito.verify(mockStudent,times(1)).processGpa();
    }

}
