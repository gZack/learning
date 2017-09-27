package mpp.lab5.prob1.samplecode.rulesets;

import mpp.lab5.prob1.samplecode.windows.ProfileWindow;

import java.awt.*;

final public class CustomerProfileRuleSet implements RuleSet {
	//package level access
	CustomerProfileRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow custProf = (ProfileWindow) ob;
		//check data
		emptyRule(custProf);
		numericRule(custProf);
		checkName(custProf);
		if(custProf.getFavoriteRestaurantValue() == custProf.getFavoriteMovieValue()){
			throw new RuleException("movie and restaurant cant bee same");
		}
		
	}

	public void emptyRule(ProfileWindow profileWindow) throws RuleException {
		if(profileWindow.getIdValue().isEmpty()){
			throw new RuleException("Id is empty");
		}
		if(profileWindow.getFirstNameValue().isEmpty()){
			throw new RuleException("first name is empty");
		}
		if(profileWindow.getLastNameValue().isEmpty()){
			throw new RuleException("last name is empty");
		}
		if(profileWindow.getFavoriteMovieValue().isEmpty()){
			throw new RuleException("movie is empty");
		}
		if(profileWindow.getFavoriteRestaurantValue().isEmpty()){
			throw new RuleException("restaurant is empty");
		}
	}

	private void numericRule(ProfileWindow profileWindow) throws RuleException {
		emptyRule(profileWindow);

		String id = profileWindow.getIdValue();
		try {
			Integer.parseInt(id);
		}catch (NumberFormatException e){
			throw new RuleException("id must be numeric");
		}
	}

	public void checkName(ProfileWindow profileWindow) throws RuleException {
		if(profileWindow.getFirstNameValue().matches("^\\s*$")
			|| profileWindow.getLastNameValue().matches("^\\s*$")
				|| !profileWindow.getFirstNameValue().matches("\\p{L}+")
					|| !profileWindow.getLastNameValue().matches("\\p{L}+")){

			throw new RuleException("invalid name");

		}
	}

}
