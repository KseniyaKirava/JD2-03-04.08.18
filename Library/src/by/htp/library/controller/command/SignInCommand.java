package by.htp.library.controller.command;

import by.htp.library.bean.User;
import by.htp.library.service.ServiceException;
import by.htp.library.service.ServiceFactory;
import by.htp.library.service.UserService;

public class SignInCommand implements Command{

	@Override
	public String execute(String request) {
		ServiceFactory factory = ServiceFactory.getInstance();
		UserService userService = factory.getUserService();
		
		User user = null;
		String response="";
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
	}

}
