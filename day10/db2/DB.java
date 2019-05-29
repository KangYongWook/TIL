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
	//모든지 담을수 있기위해서object를 넣어줌   user용으로 만들거면 uer넣어줌
	public  abstract void insert(Object obj); // 가져오고 보내고를 추상함수로 만들어줌
	public 	abstract Object select(Object obj);

//	public static void connection() { // DB에 접속을하는 커넥션 함수 만들어보자
//		System.out.println("DB Connection ...");  // 실제로 넣어줘야하지만 일단 안배워서 sysout
//	}
//	public static void close() {
//		System.out.println("DB close ...");
//	}
//	
//	public static void insertUser(String id , String name, String pwd) { // 사용자 정보를 넣어라 
//		//데이터 검증...   로직이 들어감 
//		//데이터입력 -> SQL
//		connection();
//		System.out.println(id + "" + name + "" + pwd + "Inserted");
//		close();
//	}
//	
//	public static String [] select(String id) {
//		// 데이터 검증..
//		// ID의 정보를 가지고 온다.
//		Stirng [] user = {"id01" , "james", "pwd01"};
//		return user;
//	}
}
