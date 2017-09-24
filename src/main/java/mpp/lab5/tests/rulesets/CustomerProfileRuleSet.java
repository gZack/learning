package temp.lab5.tests.rulesets;

import java.awt.Component;

import mpp.mpp.lab5.tests.RuleSet;
import mpp.mpp.lab5.tests.rulesets.RuleException;
import mpp.mpp.lab5.tests.windows.CustomerProfileWindow;

final public class CustomerProfileRuleSet implements RuleSet {
	//package level access
	CustomerProfileRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		CustomerProfileWindow custProf = (CustomerProfileWindow)ob;
		//check data
		
	}

}
