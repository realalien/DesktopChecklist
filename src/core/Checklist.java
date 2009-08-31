package core;

import java.util.ArrayList;
import java.util.Map;

public class Checklist extends BasicConcept{
	

	private ArrayList<Step> steps;
	private String memo; // can be filled with a 'script file' or 'system command', for later integration with other tool
	private boolean canBeAutomated;  // use internal login or assimilated knowledge to determined!
	private Map<String, String> applicableSituasion ; // <situasion with searchable keywords, explanation or description>
	
	//Q: how to leave interface to the outside world , use what patttern? the same to the class 'Step', e.g. commmand hooking.
	//  log hooking?
	
	
	
	/**
	 * 
	 * IDEA: how to avoid memory capacity with limited resources?
	 * */
	public void addStep(Step step){
		
	}
	
	/**
	 * IDEA:  parsing or guessing intelligently
	 * */
	public void addStepFutureWay(String step_description){
		
	}
	
	
	
	/**
	 * upload local checklist to center server
	 * */
	
	
	/**
	 * download a checklist from a server 
	 * */
}


