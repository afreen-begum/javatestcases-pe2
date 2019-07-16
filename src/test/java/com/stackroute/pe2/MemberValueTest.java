package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class MemberValueTest {

private MemberValue memberValue;
@Before
    public void setUp() {
    this.memberValue= new MemberValue();
}
@After
    public void tearDown() {
    memberValue = null;
}
@Test
    public void givenStringShouldReturnAMessage() {
    String actualResult=memberValue.membersInfo("60");
    assertEquals("retirement age",actualResult);
}
@Test
    public void givenNullShouldReturnAErrorMessage() {
    String actualResult= memberValue.membersInfo(null);
    assertEquals("Error message",actualResult);
}
@Test
    public void givenStringShouldReturnMembersName() {
    String actualResult = memberValue.membersInfo("HarryPotter");
    assertEquals("Members Name",actualResult);
}
@Test
    public void givenStringShouldReturnMembersSalary() {
    String actualResult = memberValue.membersInfo("2500.3");
    assertEquals("Members Salary",actualResult);
}
}
