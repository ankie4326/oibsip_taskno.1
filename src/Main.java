import java.sql.Connection ;
import java.sql.DriverManager ;
public class Main {
    public static void main(String[] args) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Ankita2001@");
            System.out.println(cn);
        }
        catch (Exception e) {

        }
    }
}