package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class FileLengthTest {
    private FileLength fileLength;
    @Before
    public void setUp() {
        this.fileLength=new FileLength();
    }
    @After
    public void tearDown() {
        fileLength=null;
    }
    @Test
    public void
    givenTextFileShouldReturnItsContent(){
        String actualResult=fileLength.fileDataReader("file.txt");
        assertEquals("Content of the file",actualResult);
    }
    @Test
    public void
    givenEmptyTextFileShouldReturnErrorMessage(){
        String actualResult=fileLength.fileDataReader(" ");
        assertEquals("Empty file",actualResult);
    }
    @Test
    public void givenWrongFileShouldReturnError(){
        String actualResult=fileLength.fileDataReader("afreen.txt");
        assertEquals("Wrong file selected",actualResult);
    }

}
