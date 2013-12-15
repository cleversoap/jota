package com.cleversoap.jota;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.hackoeur.jglm.Mat4;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        System.out.println("Testing the Mat4");
        Mat4 m = new Mat4();
        System.out.println(m.toString());

        assertTrue( true );
    }
}
