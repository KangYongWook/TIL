package db2;

public abstract class DB {
	
	String ip ;
	
	public DB() {
		
	}
	public DB(String ip) {
		this.ip = ip;
	}
	
	public void connection() {
		System.out.println(ip+"  Connect...");
	}
	
	public void close() {
		System.out.println(ip+" Close....");
	}
	//����� ������ �ֱ����ؼ�object�� �־���   user������ ����Ÿ� uer�־���
	public  abstract void insert(Object obj); // �������� ������ �߻��Լ��� �������
	public 	abstract Object select(Object obj);

//	public static void connection() { // DB�� �������ϴ� Ŀ�ؼ� �Լ� ������
//		System.out.println("DB Connection ...");  // ������ �־���������� �ϴ� �ȹ���� sysout
//	}
//	public static void close() {
//		System.out.println("DB close ...");
//	}
//	
//	public static void insertUser(String id , String name, String pwd) { // ����� ������ �־�� 
//		//������ ����...   ������ �� 
//		//�������Է� -> SQL
//		connection();
//		System.out.println(id + "" + name + "" + pwd + "Inserted");
//		close();
//	}
//	
//	public static String [] select(String id) {
//		// ������ ����..
//		// ID�� ������ ������ �´�.
//		Stirng [] user = {"id01" , "james", "pwd01"};
//		return user;
//	}
}
