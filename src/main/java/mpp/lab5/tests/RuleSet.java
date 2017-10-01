package mpp.lab5.tests;

import mpp.lab5.tests.rulesets.RuleException;

import java.awt.*;


public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
