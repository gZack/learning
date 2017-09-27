package mpp.demos.lecture5.factorymethods2.rulesets;

import mpp.demos.lecture5.factorymethods2.RuleSet;
import mpp.demos.lecture5.factorymethods2.windows.CustomerProfileWindow;

import java.awt.Component;

final public class CustomerProfileRuleSet implements RuleSet {
	//package level access
	CustomerProfileRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		CustomerProfileWindow custProf = (CustomerProfileWindow)ob;
		//check data
		
	}

}
