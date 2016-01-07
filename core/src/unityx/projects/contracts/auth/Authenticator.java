package unityx.projects.contracts.auth;

// Created by Unityx. All rights reserved

import unityx.projects.entities.users.User;

/**
 * Provides a contract of how an authentication module should behave.
 */
public interface Authenticator
{
	/**
	 * Attempt to log a user using given credentials.
	 *
	 * @param username The username which will be used to authenticate.
	 * @param password The password which willl be used to authenticate.
	 * @return true if the attempt was successfull, false if it was not.
	 */
	boolean login(String username, String password);

	/**
	 * Log in as given the user.
	 *
	 * @param user The user to log in.
	 */
	void sudo(User user);

	/**
	 * Get the currently authenticated user.
	 *
	 * @return The authenticated User or null if none is authenticated.
	 * @see User
	 */
	User auth();

	/**
	 * Log out the currently authenticated user.
	 * Does nothing if no user is currently authenticated.
	 */
	void logout();
}
