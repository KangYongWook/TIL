package car;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1);//  ���� car1.toString �̶󼱾��ؾ������� JVM���� �˾Ƽ� ã�Ƽ� ����
		try { //�����϶��Ϸε���
			car1.setCfSize(40);
		} catch (Exception e) { // �߸��Ǹ� �Ϸε�
			System.out.println("Too much ...");
		}
		System.out.println(car1);
		car1.go(4);
		System.out.println(car1);
	}
}
