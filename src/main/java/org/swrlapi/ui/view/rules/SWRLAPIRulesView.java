package org.swrlapi.ui.view.rules;

import javax.swing.Icon;
import javax.swing.JSplitPane;

import org.swrlapi.ui.controller.SWRLAPIApplicationController;
import org.swrlapi.ui.dialog.SWRLAPIApplicationDialogManager;
import org.swrlapi.ui.model.SWRLAPIApplicationModel;
import org.swrlapi.ui.model.SWRLRulesTableModel;
import org.swrlapi.ui.view.SWRLAPIView;
import org.swrlapi.ui.view.SWRLRulesTableView;
import org.swrlapi.ui.view.queries.SWRLAPIQueriesView;

/**
 * Component that presents a SWRL editor and rule execution graphical interface. It can be used to embed SWRL rule
 * editing and execution into an application.
 * 
 * @see SWRLAPIQueriesView
 */
public class SWRLAPIRulesView extends JSplitPane implements SWRLAPIView
{
	private static final long serialVersionUID = 1L;

	private final SWRLRulesTableView ruleTablesView;
	private final SWRLRuleExecutionView ruleExecutionView;

	private static final double SPLIT_PANE_RESIZE_WEIGHT = 0.6;

	public SWRLAPIRulesView(SWRLAPIApplicationController applicationController, Icon ruleEngineIcon)
	{
		SWRLAPIApplicationDialogManager applicationDialogManager = applicationController.getApplicationDialogManager();
		SWRLAPIApplicationModel applicationModel = applicationController.getApplicationModel();
		SWRLRulesTableModel swrlRulesTableModel = applicationModel.getSWRLRulesTableModel();

		this.ruleTablesView = new SWRLRulesTableView(applicationDialogManager, swrlRulesTableModel);
		this.ruleExecutionView = new SWRLRuleExecutionView(applicationModel, ruleEngineIcon);

		setOrientation(JSplitPane.VERTICAL_SPLIT);
		setResizeWeight(SPLIT_PANE_RESIZE_WEIGHT);
		setTopComponent(this.ruleTablesView);
		setBottomComponent(this.ruleExecutionView);
	}

	@Override
	public void update()
	{
		this.ruleTablesView.update();
		this.ruleExecutionView.update();
	}
}