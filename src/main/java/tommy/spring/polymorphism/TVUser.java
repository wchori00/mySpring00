package tommy.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV) factory.getBean(args[0]);
//		// Run As - Run Configurations.. - Arguments탭 - Program Arguments입력창에 lg/samsung적고 런!
		
		// 1. Spring 컨테이너를 구동한다
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup) 한다
//		TV tv = (TV) factory.getBean("tv");
		// applicationContext.xml에 bean등록하고 실습- 값 변경하고 싶으면 xml값만 수정하면 됨
		
		// 3-2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다
		TV tv1 = (TV) factory.getBean("tv");
		TV tv2 = (TV) factory.getBean("tv");
		TV tv3 = (TV) factory.getBean("tv");
		// 3. Spring 컨테이너를 종료한다
		factory.close();
		
		// applicationContext.xml의 scope 타입이 singleton일 경우에는 객체가 하나만 생성		
		// applicationContext.xml의 scope 타입이 prototype일 경우에는 요청이 이루어질 때마다 새로운 객체 생성
		
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
	}
}



