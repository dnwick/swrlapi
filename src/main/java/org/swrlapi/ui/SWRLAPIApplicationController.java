package org.swrlapi.ui;

import org.swrlapi.ui.core.SQWRLApplicationView;
import org.swrlapi.ui.core.SWRLAPIApplicationModel;

public class SWRLAPIApplicationController
{
	private final SQWRLApplicationView applicationViewController;
	private final SWRLAPIApplicationModel applicationModel;

	public SWRLAPIApplicationController(SQWRLApplicationView applicationViewController,
			SWRLAPIApplicationModel applicationModel)
	{
		this.applicationViewController = applicationViewController;
		this.applicationModel = applicationModel;
	}

	public SQWRLApplicationView getApplicationView()
	{
		return applicationViewController;
	}

	public SWRLAPIApplicationModel getApplicationModel()
	{
		return applicationModel;
	}
}
