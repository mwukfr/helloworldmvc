package org.helloworldmvc.main;

import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) {
		
		//instanciation des classes
		View viewclass = new View();
		Model modelclass = new Model();
		Controller controllerclass = new Controller(viewclass, modelclass);
		
		//utilisation de la méthode run
		controllerclass.run();	

	}

}
