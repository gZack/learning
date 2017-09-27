package mpp.demos.lecture5.factorymethods2;

import mpp.demos.lecture5.factorymethods2.rulesets.RuleException;

import java.awt.Component;


public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
