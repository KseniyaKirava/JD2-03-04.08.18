package by.htp.library.controller.command;

import java.util.HashMap;
import java.util.Map;

public class CommandDirector {
	private Map<String, Command> commands = new HashMap<>();

	
	public CommandDirector() {
		commands.put("signIn", new SignInCommand());
		commands.put("registration", new RegistrationCommand());
		
	}
	
	public Command getCommand(String commandName) {
		return commands.get(commandName);
	}
}
