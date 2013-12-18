package com.cleversoap.jota.entity.util;

import com.hackoeur.jglm.Vec3;

public class Face
{
    // Vertex indices
    protected Vec3 _vertex;

    // Normal indices
    protected Vec3 _normal;

    // TexCoord indices
    protected Vec3 _texCoords;

    // TODO: The material

    public Face(Vec3 vertex, Vec3 normal, Vec3 texCoords)
    {
        _vertex = vertex;
        _normal = normal;
        // TODO: Material
        _texCoords = texCoords;
    }

    public Vec3 getVertex()
    {
        return _vertex;
    }

    public Vec3 getNormal()
    {
        return _normal;
    }

    public Vec3 getTexCoord()
    {
        return _texCoords;
    }

    // TODO: getMaterial
}
