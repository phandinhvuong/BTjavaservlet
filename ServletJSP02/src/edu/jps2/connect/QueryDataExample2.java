package edu.jps2.connect;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


 
public class QueryDataExample2 {
 
  public static void main(String[] args) throws ClassNotFoundException,
          SQLException {
 
      // Láº¥y ra Ä‘á»‘i tÆ°á»£ng Connection káº¿t ná»‘i vÃ o DB.
      Connection connection = ConnectionUtils.getMyConnection();
 
      // Táº¡o Ä‘á»‘i tÆ°á»£ng Statement.
      Statement statement = connection.createStatement();
 
      String sql = "select news.ID,news.Category_id,news.Names,news.Description_news,news.Detail,news.Image_news,news.Date_news,categories.Name_category\r\n" + 
      		"from news join categories\r\n" + 
      		"on (news.Category_id=categories.ID)";
 
      // Thá»±c thi cÃ¢u lá»‡nh SQL tráº£ vá»� Ä‘á»‘i tÆ°á»£ng ResultSet.
      ResultSet rs = statement.executeQuery(sql);
 
      // Duyá»‡t trÃªn káº¿t quáº£ tráº£ vá»�.
      while (rs.next()) {// Di chuyá»ƒn con trá»� xuá»‘ng báº£n ghi káº¿ tiáº¿p.
    	  int ID = rs.getInt("ID");
          int caID = rs.getInt("Category_id");
          Date date = rs.getDate("Date_news");
          String Name = rs.getString("Names");
          String Description = rs.getString("Description_news");
          String Detail = rs.getString("Detail");
          String image = rs.getString("Image_news");
          System.out.println("--------------------");
          System.out.println("ID:" + ID);
          System.out.println("caId:" + caID);
          System.out.println("Date news:" +date);
          System.out.println("Name:" + Name);
          System.out.println("Description news:" + Description);
          System.out.println("Detail news:" + Detail);
          System.out.println("Image news:" + image);
          String Name_ca = rs.getString("Name_category");
          System.out.println("Name category:" + Name_ca);

          

         
      }
      // Ä�Ã³ng káº¿t ná»‘i
      connection.close();
  }
 
}