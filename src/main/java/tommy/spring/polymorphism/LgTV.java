package tommy.spring.polymorphism;

public class LgTV implements TV {
	
	public LgTV() {
		System.out.println("LG TV ��ü ����");
	}
	public void powerOn() {
		System.out.println("LgTV ������ �Ҵ�");
	}
	public void powerOff() {
		System.out.println("LgTV ������ ����");
	}
	public void volumeUp() {
		System.out.println("LgTV ������ �ø���");
	}
	public void volumeDown() {
		System.out.println("LgTV ������ ������");
	}
}
