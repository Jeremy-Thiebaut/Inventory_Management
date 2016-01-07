package unityx.projects.contracts.persistence;

// Created by Unityx. All rights reserved

import javax.persistence.EntityManager;

/**
 * Specifies a contract for interacting with global database settings.
 */
public interface IDatabaseRepository
{
	/**
	 * Initialize the database, it's connections and setup the environment to communicate.
	 */
	void initialize();

	/**
	 * Clean up all used resources and connections with the database.
	 */
	void finish();

	EntityManager getManager();
}
