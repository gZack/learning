package temp.lab5.prob1.samplecode.rulesets;

import mpp.mpp.lab5.prob1.samplecode.rulesets.AddressRuleSet;
import mpp.mpp.lab5.prob1.samplecode.rulesets.CustomerProfileRuleSet;
import mpp.mpp.lab5.tests.RuleSet;
import mpp.mpp.lab5.tests.windows.AddressWindow;
import mpp.mpp.lab5.tests.windows.CustomerProfileWindow;

import java.awt.*;
import java.util.HashMap;

final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {
		map.put(AddressWindow.class, new AddressRuleSet());
		map.put(CustomerProfileWindow.class, new CustomerProfileRuleSet());
	}
	public static RuleSet getRuleSet(Component c) {
		Class<? extends Component> cl = c.getClass();
		if(!map.containsKey(cl)) {
			throw new IllegalArgumentException("No RuleSet found for this Component");
		}
		return map.get(cl);
	}
}
