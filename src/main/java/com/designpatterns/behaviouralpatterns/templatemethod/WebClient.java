package com.designpatterns.behaviouralpatterns.templatemethod;

import java.util.List;

public abstract class WebClient {

	public final void execute (List<String> input) {
		if (validateInput(input)) {
			String request = composeRequest(input);
			String response = callServoice(request);
			handleResponse(response);
		}
	}
	
	protected abstract boolean validateInput(List<String> input);
	
	protected abstract String composeRequest(List<String> input);
	
	protected abstract String handleResponse(String response);
	
	protected String callServoice(String request) {
		// Code to call service here
		return "";
	}
}
