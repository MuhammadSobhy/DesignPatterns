package com.designpatterns.structuralpatterns.adapter;

public class WebClient {

	AdapterInterface adapterInterface;

	public WebClient(AdapterInterface adapterInterface) {
		this.adapterInterface = adapterInterface;
	}
	
	public void execute(Object request) {
		adapterInterface.request(request);
	}
}
