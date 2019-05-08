package org.helloworldmvc.model;

import org.helloworldmvc.Contract.IModel;

public class Model implements IModel {
	
	DAOHelloWorld filefile = new DAOHelloWorld();
	
	filefile.readFile();
	
	public String getHelloWorld() {
		return null;
	}
}
