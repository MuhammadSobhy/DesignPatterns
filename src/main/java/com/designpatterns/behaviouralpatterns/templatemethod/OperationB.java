package com.designpatterns.behaviouralpatterns.templatemethod;

import java.util.List;

public class OperationB extends WebClient {

	//Here we can add the logic specific to this operation
	
	@Override
	protected boolean validateInput(List<String> input) {
		return false;
	}

	@Override
	protected String composeRequest(List<String> input) {
		return null;
	}

	@Override
	protected String handleResponse(String response) {
		return null;
	}

}
