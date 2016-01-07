package unityx.projects.exceptions;

// Created by Unityx. All rights reserved

/**
 * Thrown when a query for models did not yield any results.
 */
public class ModelNotFoundException extends Exception
{
	/**
	 * Create a new ModelNotFoundException instance.
	 *
	 * @param s A little more information on the exception thrown
	 */
	public ModelNotFoundException(String s)
	{
		super(s);
	}
}
