package tommy.spring.polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired
//	@Qualifier("apple")
//	@Resource(name="apple")
	private Speaker speaker;
	
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
//		System.out.println("LgTV ������ �ø���");
		speaker.volumeUp();
	}
	public void volumeDown() {
//		System.out.println("LgTV ������ ������");
		speaker.volumeDown();
	}
}
