package by.htp.library.dao;

import by.htp.library.dao.impl.SQLBookDAO;
import by.htp.library.dao.impl.SQLUserDAO;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final UserDAO userDAO = new SQLUserDAO();
	private final BookDAO bookDAO = new SQLBookDAO();

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public BookDAO getBookDAO() {
		return bookDAO;
	}

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		return instance;
	}

}
