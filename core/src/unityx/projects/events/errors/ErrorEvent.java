package unityx.projects.events.errors;

// Created by Unityx. All rights reserved

public class ErrorEvent
{
	private final Exception ex;

	public ErrorEvent(Exception ex)
	{
		this.ex = ex;
	}

	public Exception getException()
	{
		return ex;
	}
}
