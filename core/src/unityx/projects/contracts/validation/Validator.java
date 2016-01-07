package unityx.projects.contracts.validation;

// Created by Unityx. All rights reserved

/**
 * Provides general validation methods.
 * <b>THIS CONTRACT HAS NO IMPLEMENTATION AND SHOULD NOT BE RESOLVED!</b>
 */
public interface Validator
{
	/**
	 * Get the reason why a validation failed.
	 *
	 * @return A string explaining why the validation failed, or null if the validation passed.
	 */
	String getReason();
}
