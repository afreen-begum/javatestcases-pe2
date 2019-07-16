package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberPower4Test {
 NumberPower4 numberpower4;
 @Before
    public void setUp() {
     this.numberpower4 = new NumberPower4();
 }
 @After
    public void tearDown(){
     numberpower4= null;
 }
 @Test
    public void givenIntegerShouldRecognizeFloatingPointValues() {
     String actualResult=numberpower4.value("2.88");
     assertEquals("given value is not an integer",actualResult);
 }
 @Test
    public void givenIntegerShouldNotAcceptNegativeValue()
 {
     String actualResult=numberpower4.value("-2");
     assertEquals("given value is negative number",actualResult);
 }
 @Test
    public void givenIntegerShouldReturnTrue() {
     String actualResult=numberpower4.value("4");
     assertEquals("given integer is true",actualResult);
 }

}
