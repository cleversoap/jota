package com.cleversoap.jota;

import com.cleversoap.jota.scene.Scene;

public class Jota
{
    protected Scene _scene;

    public Jota()
    {
    }

    public Scene getScene()
    {
        return _scene;
    }

    public void setScene(Scene value)
    {
        if (_scene != null)
            _scene.dispose();

        _scene = value;
    }

    /**
     * Render a single frame of the current scene if a scene exists.
     */
    public void render(double delta)
    {
        if (_scene != null)
            _scene.render(delta);
    }
}
