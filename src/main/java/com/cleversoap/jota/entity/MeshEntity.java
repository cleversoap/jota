package com.cleversoap.jota.entity;

//import com.hackoeur.jglm.Vec2;
//import com.hackoeur.jglm.Vector3d;
import com.hackoeur.jglm.Vec4;

import javax.vecmath.Vector2d;
import javax.vecmath.Vector3d;

import java.util.List;
import java.util.ArrayList;

public class MeshEntity extends Entity
{
    protected List<Vector3d> _vertices;
    protected List<Vector3d> _normals;

    // TODO: Look at using the TexCoord2d type
    protected List<Vector2d> _texCoords;

    public MeshEntity()
    {
        super();

        _vertices = new ArrayList<Vector3d>();
        _normals = new ArrayList<Vector3d>();
        _texCoords = new ArrayList<Vector2d>();
    }

    @Override
    public void setPosition(Vector3d value)
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
