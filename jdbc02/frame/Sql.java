package frame;
 
public class Sql {//static�� ��ü ���� ���ϰ��� �� �� ���� 
    public static String insertUser = "INSERT INTO T_USER VALUES(?,?,?)";
    public static String insertDelete = "DELETE FROM T_USER WHERE ID = ?";
    public static String insertUpdate = "UPDATE T_USER SET PWD=?,NAME=? WHERE ID=?";
    public static String insertSelect = "SELECT * FROM T_USER WHERE ID =?";
    public static String insertSelectAll = "SELECT * FROM T_USER ";
    
}