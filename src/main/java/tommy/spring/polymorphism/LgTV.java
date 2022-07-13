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
		System.out.println("LG TV 객체 생성");
	}
	public void powerOn() {
		System.out.println("LgTV 전원을 켠다");
	}
	public void powerOff() {
		System.out.println("LgTV 전원을 끈다");
	}
	public void volumeUp() {
//		System.out.println("LgTV 볼륨을 올린다");
		speaker.volumeUp();
	}
	public void volumeDown() {
//		System.out.println("LgTV 볼륨을 내린다");
		speaker.volumeDown();
	}
}
