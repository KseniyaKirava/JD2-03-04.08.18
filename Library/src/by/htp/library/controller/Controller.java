package by.htp.library.controller;

import by.htp.library.bean.User;
import by.htp.library.controller.command.Command;
import by.htp.library.controller.command.CommandDirector;
import by.htp.library.service.ServiceException;
import by.htp.library.service.ServiceFactory;
import by.htp.library.service.UserService;


public class Controller{
	private final CommandDirector commandDirector = new CommandDirector();
	
	public String doAction(String request) {
		String commandName = "signIn"; // stub
		Command command;
		
		command = commandDirector.getCommand(commandName);
	
		String response;
		
		response = command.execute(request);
		
		return response;
	}
}


/*public class Controller {
	
	public String doAction(String request) {// request  =  command=signIn|login=kkkkk|password=uweyroqo
		
		String response = "";
		String command = "signIn"; // stub
		
		ServiceFactory factory = ServiceFactory.getInstance();
		
		
		switch(command) {
		case "signIn":
			UserService userService = factory.getUserService();
			User user = null;
			try {
				user = userService.signIn("sdfs", "sdfsfs");
			
				if(user != null) {
					response = user.toString();
				}else {
					response = "Sorry, login-password";
				}
			} catch (ServiceException e) {
				// log
				response = "Sorry, ";
			}
			
			return response;
		case "registration":
			
			
			break;
		
		
		
		}
		
		return null;
	}

}
*/