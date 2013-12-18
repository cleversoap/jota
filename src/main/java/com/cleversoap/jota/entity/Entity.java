package com.cleversoap.jota.entity;

//import com.hackoeur.jglm.Vector3d;
import com.hackoeur.jglm.Vec4;

import javax.vecmath.Vector3d;

/**
 * Base class for an entity in the scene, only contains a position
 * in world space and rotation.
*/
// TODO: Should this explicitly be an abstract class?
public class Entity
{
    protected Vector3d _position;
    protected Vec4 _rotation;

    /**
    */
    public Entity()
    {
        _position = new Vector3d();
        _rotation = new Vec4();
    }

    /**
    */
    public Vector3d getPosition()
    {
        return _position;
    }

    /**
    */
    public void setPosition(Vector3d value)
    {
        _position = value;
    }

    /**
    */
    public void setPosition(float x, float y, float z)
    {
        setPosition(new Vector3d(x, y, z));
    }

    /**
    */
    public void translate(Vector3d translation)
    {
        setPosition(_position.add(translation));
    }

    /**
    */
    public void translate(float x, float y, float z)
    {
        translate(new Vector3d(x, y, z));
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
