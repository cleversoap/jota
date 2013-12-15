package com.cleversoap.jota;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.hackoeur.jglm.Mat4;

import com.cleversoap.jota.scene.SceneList;

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
        System.out.println("Creating new Jota instance");
        Jota j = new Jota();
        j.setScene(new SceneList());
        assertTrue( true );
    }
}
