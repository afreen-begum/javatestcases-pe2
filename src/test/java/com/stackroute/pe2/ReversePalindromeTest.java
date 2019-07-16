package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.*;
public class ReversePalindromeTest {
 private ReversePalindrome  reversePalindrome;
  @Before
    public void setup() {
      this.reversePalindrome = new ReversePalindrome();
  }
  @After
  public void testDown() {
      reversePalindrome = null;
  }
    @Test
    public void givenStringShouldReturnReverseValue() {
        String actualResult = reversePalindrome.palindrome("afreen");
        assertEquals("neerfa",actualResult);
    }
    @Test
    public void givenStringShouldRecognizeEmptyString() {
      String actualResult = reversePalindrome.palindrome("");
      assertEquals("",actualResult);
    }
}