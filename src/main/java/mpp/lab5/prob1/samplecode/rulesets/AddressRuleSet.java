package mpp.lab5.prob1.samplecode.rulesets;

import mpp.lab5.prob1.samplecode.windows.AddrWindow;

import java.awt.*;

final public class AddressRuleSet implements RuleSet {
	//package level access
	AddressRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		AddrWindow addr = (AddrWindow) ob;


		numericRule(addr);
		digitCountLimitRule(addr);
		stringLenghtLimit(addr);
		if(addr.getIdValue() == addr.getZipValue()){
			throw new RuleException("id and zip are same");
		}
		//comment
		//throw new RuleException("An address rule has been violated!");
		
	}

	private void emptinessRule(AddrWindow addr) throws RuleException{
		if(addr.getIdValue().isEmpty()){
			throw new RuleException("Id is empty");
		}
		if(addr.getCityValue().isEmpty()){
			throw new RuleException("City must not be empty");
		}
		if(addr.getStateValue().isEmpty()){
			throw new RuleException("State is empty");
		}
		if(addr.getStreetValue().isEmpty()){
			throw new RuleException("Street is empty");
		}
		if(addr.getZipValue().isEmpty()){
			throw new RuleException("Zip is empty");
		}
	}
	
	private void numericRule(AddrWindow addr) throws RuleException {
		emptinessRule(addr);
		String zip = addr.getZipValue();
		try {
			Integer.parseInt(zip);
		} catch(NumberFormatException e) {
			throw new RuleException("Zip must be numeric");
		}

		String id = addr.getIdValue();
		try {
			Integer.parseInt(id);
		}catch (NumberFormatException e){
			throw new RuleException("id must be numeric");
		}
	}

	private void digitCountLimitRule(AddrWindow addr) throws RuleException{
		emptinessRule(addr);
		numericRule(addr);
		if(addr.getZipValue().length() != 5){
			throw new RuleException("Zip have more digits");
		}
	}

	private void stringLenghtLimit(AddrWindow addr) throws RuleException{
		emptinessRule(addr);
		if(addr.getStateValue().length() != 2){
			throw new RuleException("State have more digits");
		}
	}


}
