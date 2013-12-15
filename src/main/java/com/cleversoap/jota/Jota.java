package com.cleversoap.jota;

import com.cleversoap.jota.scene.Scene;

public class Jota
{
    protected Scene _scene;

    public Jota()
    {
    }

    /**
     * Render a single frame of the current scene if a scene exists.
     */
    public void render(int delta)
    {
        if (_scene != null)
            _scene.render(delta);
    }
}
