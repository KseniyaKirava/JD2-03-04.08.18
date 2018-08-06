package by.htp.library.service.impl;

import by.htp.library.bean.User;
import by.htp.library.dao.DAOException;
import by.htp.library.dao.DAOFactory;
import by.htp.library.dao.UserDAO;
import by.htp.library.dao.impl.SQLUserDAO;
import by.htp.library.service.ServiceException;
import by.htp.library.service.UserService;
import by.htp.library.service.validation.Validator;

public class UserServiceImpl implements UserService {

	@Override
	public User signIn(String login, String password) throws ServiceException {
		if (!Validator.crValidation(login, password)) {
			throw new ServiceException("validation error message");
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		UserDAO userDAO = factory.getUserDAO();
		
		User user = null;
		try {
			user = userDAO.singIn(login, password);
		} catch (DAOException e) {
			throw new ServiceException("sp. service error message", e);
		}
		
		return user;
	}

	@Override
	public void registration(User user) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

}
