package rules;

import data_types.MISBounds;
import nodes.MISNode;
import rules.MISRuleNode.options;

public class MISRuleNodePosition extends MISRuleNode {

	public MISBounds xBounds;
	public MISBounds yBounds;
	public MISBounds zBounds;
	
	public MISRuleNodePosition(String name, MISNode node, options option) {
		super(name, node, option);
	}
	
	@Override
	public String getUserInput(){
		return "(min,max):x("+xBounds.min+","+xBounds.max+") - y("+yBounds.min+","+yBounds.max+") - z("+zBounds.min+","+zBounds.max+")";
	}

}
