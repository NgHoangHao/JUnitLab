package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.StringManipulator;

public class StringManipulatorTest {
    StringManipulator stringManipulator = new StringManipulator();

    @Test(timeout = 1000)
    public void testReverse() {
      assertEquals("abcde",stringManipulator.reverse("edcba"));
       // Your code here
    }

    @Test(timeout = 1000)
    public void testIsPalindrome() {
       assertEquals(true, stringManipulator.isPalindrome("aabaa"));
    }

    @Test(timeout = 1000)
    public void testIsContained() {
       assertEquals(true,stringManipulator.isContained("NguyenHoangHao", "Hoang"));
    }

    @Test(timeout = 1000)
    public void testNumberRemoved() {
       assertEquals("num", stringManipulator.numberRemoved("123num"));
    }

    @Test(timeout = 1000)
    public void testUpperString() {
       assertEquals("NGUYEN", stringManipulator.upperString("nguyen"));
    }

    @Test(timeout = 1000)
    public void testLowerString() {
       assertEquals("nguyen",stringManipulator.lowerString("NGUYen"));
    }

    @Test(timeout = 1000)
    public void testCapitalString() {
       assertEquals("Nguyen Hoang Hao",stringManipulator.capitalString("nguyen hoang hao"));
    }

    @Test(timeout = 1000)
    public void testCountVowels() {
       assertEquals(2, stringManipulator.countVowels("Nguyen"));
    }

    @Test(timeout = 1000)
    public void testCountWords() {
       assertEquals(3,stringManipulator.countWords("Nguyen Hoang Hao"));
    }

    @Test(timeout = 1000)
    public void testFindSubstringIndex() {
       assertEquals(5, stringManipulator.findSubstringIndex("Java programming", "programming"));
    }

    @Test(timeout = 1000)
    public void testReverseWords() {
       assertEquals("Hello World", stringManipulator.reverseWords("World Hello"));
    }    
}
