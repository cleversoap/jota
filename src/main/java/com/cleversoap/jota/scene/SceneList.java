package com.cleversoap.jota.scene;

import java.util.List;
import java.util.ArrayList;

import com.cleversoap.jota.entity.Entity;
import com.cleversoap.jota.interfaces.IRenderable;

/**
 * Flat list of entities in a scene that will be rendered in order
 * and therefore with no need of nodes.
 */
public class SceneList extends Scene
{
    /// Flat list of entities.
    protected List<Entity> _entities;

    public SceneList()
    {
        _entities = new ArrayList<Entity>();
    }

    /**
     * Iterate over the list of entities to process them.
     */
    @Override
    public void render(double delta)
    {
        for (Entity entity : _entities)
        {
            if (entity instanceof IRenderable)
            {
                ((IRenderable)entity).render(delta);
            }
        }
    }
}

