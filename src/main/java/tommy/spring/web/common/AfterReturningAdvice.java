package tommy.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import tommy.spring.web.user.UserVO;

@Service
@Aspect
public class AfterReturningAdvice {
	@Pointcut("execution(* tommy.spring.web..*Impl.get*(..))")
	public void getPointcut() {
	}
//	@AfterReturning(pointcut = "getPointcut()", returning = "returnObj")
	@AfterReturning(pointcut = "PointcutCommon.getPointcut()", returning = "returnObj")
	public void afterLog(JoinPoint joinPoint, Object returnObj) {
//		System.out.println("[����ó��]: ����Ͻ� ���� ���� �� ó��");
		String method = joinPoint.getSignature().getName();
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			if(user.getRole().equals("admin")) {
				System.out.println(user.getName() + "�α���(Admin)");
			}
		}
		System.out.println("[����ó��]: " + method + "() �޼��� ���ϰ�: " + returnObj.toString());
	}
}
