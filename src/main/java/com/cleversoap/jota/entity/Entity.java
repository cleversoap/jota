package com.cleversoap.jota.entity;

import com.hackoeur.jglm.Vec3;

/**
 * Base class for an entity in the scene, only contains a position
 * in world space and rotation.
*/
// TODO: Should this explicitly be an abstract class?
public class Entity
{
    protected Vec3 _position;

    /**
    */
    public Entity()
    {
        _position = new Vec3();
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
}
