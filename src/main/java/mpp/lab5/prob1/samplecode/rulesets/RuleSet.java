package temp.lab5.prob1.samplecode.rulesets;

import mpp.mpp.lab5.tests.rulesets.RuleException;

import java.awt.*;


public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
