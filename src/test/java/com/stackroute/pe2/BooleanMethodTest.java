package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class BooleanMethodTest {
    BooleanMethod booleanMethod;
    @Before
    public void setUp() {
        this.booleanMethod= new BooleanMethod();
    }
    @After
    public void tearDown() {
        booleanMethod=null;
    }
    @Test
    public void testIsEven(){
        boolean result=booleanMethod.isEven(120);
        assertEquals(true,result);
    }
    @Test
    public void testIsNotEven(){
        boolean result=booleanMethod.isEven(121);
        assertEquals(false,result);
    }
    @Test
    public void testIsNum(){
        boolean result=booleanMethod.isNotNum('d');
        assertFalse(result);
    }
}
