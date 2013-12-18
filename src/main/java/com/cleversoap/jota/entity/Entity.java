package com.cleversoap.jota.entity;

//import com.hackoeur.jglm.Vector3f;
import com.hackoeur.jglm.Vec4;

import javax.vecmath.Vector3f;

/**
 * Base class for an entity in the scene, only contains a position
 * in world space and rotation.
*/
// TODO: Should this explicitly be an abstract class?
public class Entity
{
    protected Vector3f _position;
    protected Vec4 _rotation;

    /**
    */
    public Entity()
    {
        _position = new Vector3f();
        _rotation = new Vec4();
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
    public Vec4 getRotation()
    {
        return _rotation;
    }

    public void setRotation(Vec4 value)
    {
        _rotation = value;
    }

    public void setRotation(float x, float y, float z, float w)
    {
        setRotation(new Vec4(x, y, z, w));
    }
}
