package tommy.spring.web.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {
	@Pointcut("execution(* tommy.spring.web..*Impl.*(..))")
	public void allPointcut() {
	}
//	@Around("allPointcut()")
	@Around("PointcutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
//		System.out.println("[BEFORE]: ����Ͻ� �޼��� ���� ���� ó���� ����...");
//		Object returnObj = joinPoint.proceed();
//		System.out.println("[AFTER] ����Ͻ� �޼��� ���� �Ŀ� ó���� ����...");
//		return returnObj;
		
		String method = joinPoint.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object returnObj = joinPoint.proceed();
		stopWatch.stop();
		System.out.println(method + "() �޼��� ���࿡ �ɸ� �ð�: " + stopWatch.getTotalTimeMillis() + "(ms)��");
		return returnObj;
	}
}
