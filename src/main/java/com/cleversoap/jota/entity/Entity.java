package com.cleversoap.jota.entity;

import javax.vecmath.Vector3f;
import javax.vecmath.Quat4f;

/**
 * Base class for an entity in the scene, only contains a position
 * in world space and rotation.
*/
// TODO: Should this explicitly be an abstract class?
public class Entity
{
    protected Vector3f _position;
    protected Quat4f _rotation;

    /**
    */
    public Entity()
    {
        _position = new Vector3f();
        _rotation = new Quat4f();
    }

    /**
    */
    public Vector3f getPosition()
    {
        return _position;
    }

    /**
    */
    public void setPosition(Vector3f value)
    {
        _position = value;
    }

    /**
    */
    public void setPosition(float x, float y, float z)
    {
        setPosition(new Vector3f(x, y, z));
    }

    /**
    */
    public void translate(Vector3f translation)
    {
        _position.add(translation);
    }

    /**
    */
    public void translate(float x, float y, float z)
    {
        translate(new Vector3f(x, y, z));
    }

    /**
     */
    public Quat4f getRotation()
    {
        return _rotation;
    }

    public void setRotation(Quat4f value)
    {
        _rotation = value;
    }

    public void setRotation(float x, float y, float z, float w)
    {
        setRotation(new Quat4f(x, y, z, w));
    }
}
