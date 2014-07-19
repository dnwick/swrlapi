package org.swrlapi.exceptions;

public class BuiltInException extends SWRLAPIException
{
	private static final long serialVersionUID = 1L;

	public BuiltInException()
	{
		super();
	}

	public BuiltInException(String message)
	{
		super(message);
	}

	public BuiltInException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
