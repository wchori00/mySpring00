package tommy.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV) factory.getBean(args[0]);
//		// Run As - Run Configurations.. - Arguments�� - Program Arguments�Է�â�� lg/samsung���� ��!
		
		// 1. Spring �����̳ʸ� �����Ѵ�
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//		// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup) �Ѵ�
//		TV tv = (TV) factory.getBean("tv");
		
		// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)�Ѵ�
		TV tv1 = (TV) factory.getBean("tv");
		TV tv2 = (TV) factory.getBean("tv");
		TV tv3 = (TV) factory.getBean("tv");
		// applicationContext.xml�� scope Ÿ���� singleton�� ��쿡�� ��ü�� �ϳ��� ����		
		// applicationContext.xml�� scope Ÿ���� prototype�� ��쿡�� ��û�� �̷���� ������ ���ο� ��ü ����
		
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
	}
}



