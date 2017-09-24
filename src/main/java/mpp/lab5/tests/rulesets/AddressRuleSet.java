package temp.lab5.tests.rulesets;

import mpp.mpp.lab5.tests.RuleSet;
import mpp.mpp.lab5.tests.rulesets.RuleException;
import mpp.mpp.lab5.tests.windows.AddressWindow;

import java.awt.Component;

final public class AddressRuleSet implements RuleSet {
	//package level access
	AddressRuleSet() {}
	@Override
	public void applyRules(Component ob) throws mpp.mpp.lab5.tests.rulesets.RuleException {
		AddressWindow addr = (AddressWindow)ob;
		
		numericRule(addr);
		//comment 
		throw new mpp.mpp.lab5.tests.rulesets.RuleException("An address rule has been violated!");
		
	}
	
	private void numericRule(AddressWindow addr) throws RuleException {
//		String zip = addr.getZipValue();
//		try {
//			Integer.parseInt(zip);
//		} catch(NumberFormatException e) {
//			throw new RuleException("Zip must be numeric");
//		}
	}

}
