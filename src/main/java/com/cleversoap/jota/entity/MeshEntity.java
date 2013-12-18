package com.cleversoap.jota.entity;

import javax.vecmath.Vector2f;
import javax.vecmath.Vector3f;
import javax.vecmath.Quat4f;
import javax.vecmath.TexCoord2f;

import java.util.List;
import java.util.ArrayList;

public class MeshEntity extends Entity
{
    protected List<Vector3f> _vertices;
    protected List<Vector3f> _normals;
    protected List<TexCoord2f> _texCoords;

    public MeshEntity()
    {
        super();

        _vertices = new ArrayList<Vector3f>();
        _normals = new ArrayList<Vector3f>();
        _texCoords = new ArrayList<TexCoord2f>();
    }

    @Override
        public void setPosition(Vector3f value)
        {
            super.setPosition(value);
            // TODO: Update mesh matricies
        }

    @Override
        public void setRotation(Quat4f value)
        {
            super.setRotation(value);
            // TODO: Update mesh matricies
        }
}
