package com.cleversoap.jota.entity;

import com.hackoeur.jglm.Vec3;
import com.hackoeur.jglm.Vec4;

public class MeshEntity extends Entity
{
    public MeshEntity()
    {
        super();
    }

    @Override
    public void setPosition(Vec3 value)
    {
        super.setPosition(value);
        // TODO: Update mesh matricies
    }

    @Override
    public void setRotation(Vec4 value)
    {
        super.setRotation(value);
        // TODO: Update mesh matricies
    }
}
