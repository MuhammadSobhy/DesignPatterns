package com.designpatterns.structuralpatterns.adapter;

public class WebAdapter implements AdapterInterface{

	WebService webService; 
	
	
	public WebAdapter(WebService webService) {
		this.webService = webService;
	}


	@Override
	public void request(Object request) {
		String json = null; // convert object to json
		webService.execute(json);
	}

	
}
