package tommy.spring.web.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import tommy.spring.web.board.impl.BoardDAO;

public class GetBoardListController implements Controller {

	@Override
//	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�� ��� �˻� ó��");
		// 1. ����� �Է� ���� ����: �˻� ����� ���߿� ����
		
		// 2. �����ͺ��̽� ���� ó��
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
		// 3. ���� ȭ�� ����
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardList);	// Model ��������
//		mav.setViewName("getBoardList.jsp");	// View ��������
		mav.setViewName("getBoardList");		// View ��������
		return mav;
//		HttpSession session = request.getSession();
//		session.setAttribute("boardList", boardList);
//		return "getBoardList";
	}

}
