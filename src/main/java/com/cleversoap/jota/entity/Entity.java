package com.cleversoap.jota.entity;

import com.hackoeur.jglm.Vec3;
import com.hackoeur.jglm.Vec4;

/**
 * Base class for an entity in the scene, only contains a position
 * in world space and rotation.
*/
// TODO: Should this explicitly be an abstract class?
public class Entity
{
    protected Vec3 _position;
    protected Vec4 _rotation;

    /**
    */
    public Entity()
    {
        _position = new Vec3();
        _rotation = new Vec4();
    }

    /**
    */
    public Vec3 getPosition()
    {
        return _position;
    }

    /**
    */
    public void setPosition(Vec3 value)
    {
        _position = value;
    }

    /**
    */
    public void setPosition(float x, float y, float z)
    {
        setPosition(new Vec3(x, y, z));
    }

    /**
    */
    public void translate(Vec3 translation)
    {
        setPosition(_position.add(translation));
    }

    /**
    */
    public void translate(float x, float y, float z)
    {
        translate(new Vec3(x, y, z));
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
