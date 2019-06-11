package frame;

public class SqlProducts {
    public static String insertProduct = "INSERT INTO PRODUCTS VALUES(?,?,?,?,?,?,?,?)";
    public static String DeleteProduct = "DELETE FROM PRODUCTS WHERE PDNO = ?";
    public static String UpdateProduct = "Update PRODUCTS SET PDNAME=?, PDSUBNAME=?, FACTNO=?, PDDATE=?, PDCOST=?, PDPRICE=?, PDAMOUNT = ?  WHERE PDNO=?";
    public static String SelectProduct = "SELECT * FROM PRODUCTS WHERE PDNO = ?";
    public static String SelectAllProduct = "SELECT * FROM PRODUCTS";
    public static String SelectAll = "SELECT p.PDNAME,p.PDSUBNAME,f.FACNAME,f.FACLOC FROM PRODUCTS p, FACTORY f WHERE p.FACTNO = f.FACTNO";
}
