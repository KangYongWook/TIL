package frame;

public class SqlFactory {
    public static String insertFactory = "INSERT INTO FACTORY VALUES(?,?,?)";
    public static String DeleteFactory = "DELETE FROM FACTORY WHERE FACTNO = ?";
    public static String UpdateFactory = "Update PRODUCTS SET FACNAME =?, FACLOC=?, WHERE FACTNO=?";
    public static String SelectFactory = "SELECT * FROM PRODUCTS WHERE PDNO = ?";
    public static String SelectAllFactory = "SELECT * FROM PRODUCTS";
}


