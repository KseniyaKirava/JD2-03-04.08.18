package by.htp.library.service;

import by.htp.library.bean.Book;

public interface LibraryService {
	void add(Book book) throws ServiceException;
}
