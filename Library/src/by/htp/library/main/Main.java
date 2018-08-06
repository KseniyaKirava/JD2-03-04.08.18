package by.htp.library.main;

import by.htp.library.controller.Controller;
import by.htp.library.view.View;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		
		String request;
		String response;
		
		request = View.getRequest();
		response = controller.doAction(request);
		
		View.showResults(response);
		

	}

}
