package tommy.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {
	@Pointcut("execution(* tommy.spring.web..*Impl.*(..))")
	public void allPointcut() {
	}
//	@AfterThrowing(pointcut = "allPointcut()", throwing = "e")
	@AfterThrowing(pointcut = "PointcutCommon.allPointcut()", throwing = "e")
	public void exceptionLog(JoinPoint joinPoint, Exception e) {
//		System.out.println("[����ó��]: ����Ͻ� ���� ���� �� ���� �߻�");
		String method = joinPoint.getSignature().getName();
		System.out.println("[����ó��]: " + method + "()�޼��� ���� �� �߻��� ���� �޼���: " + e.getMessage());
	}
}
