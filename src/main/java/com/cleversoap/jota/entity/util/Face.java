package com.cleversoap.jota.entity.util;

import javax.vecmath.Vector3f;

public class Face
{
    // Vertex indices
    protected Vector3f _vertex;

    // Normal indices
    protected Vector3f _normal;

    // TexCoord indices
    protected Vector3f _texCoords;

    // TODO: The material

    public Face(Vector3f vertex, Vector3f normal, Vector3f texCoords)
    {
        _vertex = vertex;
        _normal = normal;
        // TODO: Material
        _texCoords = texCoords;
    }

    public Vector3f getVertex()
    {
        return _vertex;
    }

    public Vector3f getNormal()
    {
        return _normal;
    }

    public Vector3f getTexCoord()
    {
        return _texCoords;
    }

    // TODO: getMaterial
}
