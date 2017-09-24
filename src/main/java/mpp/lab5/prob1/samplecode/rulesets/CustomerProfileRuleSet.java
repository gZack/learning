package temp.lab5.prob1.samplecode.rulesets;

import mpp.mpp.lab5.prob1.samplecode.rulesets.RuleException;
import mpp.mpp.lab5.tests.RuleSet;
import mpp.mpp.lab5.tests.windows.CustomerProfileWindow;

import java.awt.*;

final public class CustomerProfileRuleSet implements RuleSet {
	//package level access
	CustomerProfileRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		CustomerProfileWindow custProf = (CustomerProfileWindow)ob;
		//check data
		
	}

}
