package com.cleversoap.jota;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.lwjgl.opengl.GL11.GL_BLEND;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_TEST;
import static org.lwjgl.opengl.GL11.GL_ONE_MINUS_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.glBlendFunc;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glDisable;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glViewport;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import com.cleversoap.jota.scene.SceneList;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    // TODO: Put app test properties in a .properties file

    // VSync
    public static final boolean VSYNC = true;

    // Dimensions
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    // Fullscreen
    public static final boolean FULLSCREEN = false;

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
        try
        {
            // Setup test display
            Display.setTitle("Jota App Test");
            Display.setResizable(true);
            Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
            Display.setVSyncEnabled(VSYNC);
            Display.setFullscreen(FULLSCREEN);

            // Show test display
            Display.create();

            // Initialise OpenGL
            glEnable(GL_DEPTH_TEST);
            glEnable(GL_BLEND);
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
            glClearColor(0f, 0f, 0f, 0f);

            resize();

            System.out.println("Creating new Jota instance");
            Jota j = new Jota();
            j.setScene(new SceneList());

            // TODO: Initialise scene contents
            while (!Display.isCloseRequested())
            {
                if (Display.wasResized())
                    resize();

                j.render(1/60);
            }

            assertTrue(true);
        }
        catch (LWJGLException e)
        {
            System.out.println("Error in Jota App Test");
            assertTrue(false);
        }
    }

    // Resize the game projection
    protected void resize()
    {
        glViewport(0, 0, Display.getWidth(), Display.getHeight());
    }
}
