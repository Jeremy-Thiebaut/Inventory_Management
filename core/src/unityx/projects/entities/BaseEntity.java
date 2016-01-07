package unityx.projects.entities;

// Created by Unityx. All rights reserved

/**
 * Base class for all entities. This is used for building abstract queries based on primary keys.
 */
public abstract class BaseEntity
{
	private long id;

	/**
	 * Get the primary index for this model
	 *
	 * @return The identifier of this model.
	 */
	public long getId()
	{
		return id;
	}
}
