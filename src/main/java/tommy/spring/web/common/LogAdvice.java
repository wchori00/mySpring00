package tommy.spring.web.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//@Service
//@Aspect // Aspect = Pointcut + Advice
public class LogAdvice {
//	@Pointcut("execution(* tommy.spring.web..*Impl.*(..))")			// ����Ʈ��
	public void allPointcut() {
	}
//	@Pointcut("execution(* tommy.spring.web..*Impl.get*(..))")		//    +
//	public void getPointcut() {
//	}
//	@Before("allPointcut()")										// �����̽�
	public void printLog() {
		System.out.println("[���� �α�]: ����Ͻ� ���� ���� �� ����");
	}
}
