package viewutils;

import java.util.ArrayList;

import org.apache.tomcat.util.codec.binary.Base64;

import bo.Book;
import viewbo.BookView;

public class BookUtils {

	public static ArrayList<BookView> convertToBookViewList(ArrayList<Book> bookList) {

		ArrayList<BookView> bookViewList = new ArrayList<BookView>();
		for (Book book : bookList) {
			bookViewList.add(convertToBookView(book));

		}
		return bookViewList;
	}

	public static BookView convertToBookView(Book book) {
		BookView bookView = new BookView();
		bookView.setId(book.getId());
		bookView.setName(book.getName());
		bookView.setAuthor(book.getAuthor());
		bookView.setPublisher(book.getPublisher());
		bookView.setPrice(book.getPrice());
		bookView.setCreateDate(book.getCreate().toString());

		String photoEncode = Base64.encodeBase64String(book.getPhoto());

		bookView.setPhoto(photoEncode);

		return bookView;
	}

}