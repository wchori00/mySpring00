package tommy.spring.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import tommy.spring.web.user.impl.UserDAO;

@Controller
public class LoginController {
	@RequestMapping("/login.do")
//	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	public String login(UserVO vo, UserDAO userDAO) {
		System.out.println("�α��� ó��");
		// 1. ����� �Է� ���� ����
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");		
		
		// 2. �����ͺ��̽� ���� ó��
//		UserVO vo = new UserVO();
//		vo.setId(id);
//		vo.setPassword(password);
		
//		UserDAO userDAO = new UserDAO();
//		UserVO user = userDAO.getUser(vo);
		
		// 3. ȭ�� �׺���̼�
//		ModelAndView mav = new ModelAndView();
//		if(user != null) {
		if(userDAO.getUser(vo) != null) {
			return "getBoardList.do";
//			//mav.setViewName("getBoardList.do");
//			mav.setViewName("redirect:getBoardList.do");
		}else {
//			//return "login";
			return "login.jsp";
//			//mav.setViewName("login.jsp");
//			mav.setViewName("redirect:login.jsp");
		}
//		return mav;

	}
}
