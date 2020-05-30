package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import bo.Book;
import dbconnection.ConnectionUtils;


public class BookDAO {
	public Book getBook(int id) {
		/*
		 * Connection connection = null; PreparedStatement preparedStatement = null;
		 * ResultSet resultSet = null; try { connection =
		 * ConnectionUtils.getMyConnection(); String sql =
		 * "SELECT * FROM book WHERE id = ?"; preparedStatement =
		 * connection.prepareStatement(sql); preparedStatement.setInt(1, id); resultSet
		 * = preparedStatement.executeQuery(); while (resultSet.next()) { Book book =
		 * convertToBook(resultSet); return book; } } catch (SQLException e) { //Handle
		 * errors for JDBC e.printStackTrace(); } finally { //finally block used to
		 * close resources if (resultSet != null) { try { resultSet.close(); } catch
		 * (SQLException e) { e.printStackTrace(); } }
		 * 
		 * if (preparedStatement != null) { try { preparedStatement.close(); } catch
		 * (SQLException e) { e.printStackTrace(); } }
		 * 
		 * if (connection != null) { try { connection.close(); } catch (SQLException e)
		 * { e.printStackTrace(); } } }
		 * 
		 * return null;
		 */
		ArrayList<Book> bookList = new ArrayList<Book>();
		String sql = "SELECT * FROM book WHERE " + "ID = " + id;
		Connection conn;
		try {
			conn = ConnectionUtils.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Book bookOut = new Book();
				bookOut.setId(rs.getInt("id"));
				bookOut.setName(rs.getString("name"));
				bookOut.setAuthor(rs.getString("author"));
				bookOut.setPublisher(rs.getString("publisher"));
				bookOut.setPrice(rs.getInt("price"));
				// bookOut.setCreate(rs.getString("Email")).toString();

				bookList.add(bookOut);
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (bookList != null && !bookList.isEmpty()) {
			return bookList.get(0);
		}
		return null;
	}


	/*
	 * Connection connection = null; Statement statement = null; ResultSet resultSet
	 * = null; ArrayList<Book> bookList = new ArrayList<Book>();
	 * 
	 * try { connection = ConnectionUtils.getMyConnection(); String sql =
	 * "SELECT * FROM book"; statement = connection.createStatement(); resultSet =
	 * statement.executeQuery(sql); while (resultSet.next()) {
	 * bookList.add(convertToBook(resultSet)); } } catch (SQLException e) { //Handle
	 * errors for JDBC e.printStackTrace(); } finally { //finally block used to
	 * close resources if (resultSet != null) { try { resultSet.close(); } catch
	 * (SQLException e) { e.printStackTrace(); } }
	 * 
	 * if (statement != null) { try { statement.close(); } catch (SQLException e) {
	 * e.printStackTrace(); } }
	 * 
	 * if (connection != null) { try { connection.close(); } catch (SQLException e)
	 * { e.printStackTrace(); } } }
	 * 
	 * return bookList;
	 */
	public ArrayList<Book> getAllBook() {
		ArrayList<Book> booklist = new ArrayList<Book>();
		String sql = "Select * from book";
		Connection conn;
		try {
			conn = ConnectionUtils.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Book bookOut = new Book();
				bookOut.setId(rs.getInt("id"));
				bookOut.setName(rs.getString("name"));
				bookOut.setAuthor(rs.getString("author"));
				bookOut.setPublisher(rs.getString("publisher"));
				bookOut.setPrice(rs.getInt("price"));
				// bookOut.setCreate(rs.getString("Email")).toString();

				booklist.add(bookOut);
			}
		} catch (ClassNotFoundException el) {
			el.printStackTrace();
		} catch (SQLException el) {
			el.printStackTrace();
		}
		return booklist;
	}

	public ArrayList<Book> findBookByName(String name) throws ClassNotFoundException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ArrayList<Book> bookList = new ArrayList<Book>();

		try {
			connection = ConnectionUtils.getMyConnection();
			String sql = "SELECT * FROM book WHERE name = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				bookList.add(convertToBook(resultSet));
			}
		} catch (SQLException e) {
			// Handle errors for JDBC
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return bookList;
	}

	public void insertBook(Book book) throws ClassNotFoundException {
		/*
		 * Connection connection = null; PreparedStatement preparedStatement = null;
		 * String insertSQL =
		 * "INSERT INTO book (name,author,publisher,price,photo,create_date) VALUES (?,?,?,?,?,?)"
		 * ; try { connection = ConnectionUtils.getMyConnection(); preparedStatement =
		 * connection.prepareStatement(insertSQL); preparedStatement.setString(1,
		 * book.getName()); preparedStatement.setString(2, book.getAuthor());
		 * preparedStatement.setString(3, book.getPublisher());
		 * preparedStatement.setInt(4, book.getPrice()); preparedStatement.setBytes(5,
		 * book.getPhoto()); preparedStatement.setDate(6, book.getCreate());
		 * preparedStatement.executeUpdate();
		 * 
		 * } catch (SQLException e) { // Handle errors for JDBC e.printStackTrace(); }
		 * finally { // finally block used to close resources if (preparedStatement !=
		 * null) { try { preparedStatement.close(); } catch (SQLException e) {
		 * e.printStackTrace(); } }
		 * 
		 * if (connection != null) { try { connection.close(); } catch (SQLException e)
		 * { e.printStackTrace(); } } }
		 */
		String sql = "INSERT INTO book(name, author, publisher, price,photo,create_date) VALUES("
				+ "'" + book.getName() + "',"
				+ "'" + book.getAuthor() + "',"
				+ "'" + book.getPublisher() + "',"
				+ "'" + book.getPrice() + "',"
				+ "'" + book.getPhoto() + "',"
				+ "'" + book.getCreate() + "')";
		Connection conn;
		try {
			conn = ConnectionUtils.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void updateBook(Book book) throws ClassNotFoundException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {

			String updateSql = "UPDATE book SET name = ?, author = ?, publisher = ?, price = ? WHERE id = ?";
			connection = ConnectionUtils.getMyConnection();
			preparedStatement = connection.prepareStatement(updateSql);
			preparedStatement.setString(1, book.getName());
			preparedStatement.setString(2, book.getAuthor());
			preparedStatement.setString(3, book.getPublisher());
			preparedStatement.setInt(4, book.getPrice());
			preparedStatement.setInt(5, book.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// Handle errors for JDBC
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void deleteBook(int bookId) throws ClassNotFoundException {
		Connection connection = null;
		Statement statement = null;
		try {
			String sql = "DELETE FROM book WHERE id =" + bookId;
			connection = ConnectionUtils.getMyConnection();
			statement = connection.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// Handle errors for JDBC
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static Book convertToBook(ResultSet rs) throws SQLException {
		Book book = new Book();
		book.setId(rs.getInt(1));
		book.setName(rs.getString(2));
		book.setAuthor(rs.getString(3));
		book.setPublisher(rs.getString(4));
		book.setPrice(rs.getInt(5));
		byte[] imgData = rs.getBytes("photo");
		book.setPhoto(imgData);
		return book;
	}

}
