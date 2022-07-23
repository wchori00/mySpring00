package tommy.spring.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LogoutController implements Controller {
	@Override
//	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�α׾ƿ� ó��");
		// 1. �������� ����� ���� ��ü�� ����
		HttpSession session = request.getSession(false);
		session.invalidate();
		// 2. ���� ���� �� ���� ȭ������ �̵�
		ModelAndView mav = new ModelAndView();
//		mav.setViewName("login.jsp");
		mav.setViewName("redirect:login.jsp");
		return mav;
//		return "login";
	}
}
