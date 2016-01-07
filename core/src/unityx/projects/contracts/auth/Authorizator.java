package unityx.projects.contracts.auth;

// Created by Unityx. All rights reserved

/**
 * Provides a contract of how an authorization module should behave.
 */
public interface Authorizator
{
	/**
	 * Check if the currently authorized user has the given permission.
	 *
	 * @param permission The permission to check.
	 * @return true if the user has this permission, false if not or if no user is authenticated.
	 */
	boolean can(String permission);

	/**
	 * Check if a user doesn't have given permission.
	 *
	 * @param permission The permission to check.
	 * @return true if the user doesn't have this permission or no user is authenticated,
	 * false if the user has this permission.
	 */
	boolean cannot(String permission);

}
