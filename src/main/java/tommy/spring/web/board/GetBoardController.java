package tommy.spring.web.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import tommy.spring.web.board.impl.BoardDAO;

public class GetBoardController implements Controller {

	@Override
//	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�� �� ���� ó��");
		// 1. �˻��� �Խñ� ��ȣ ����
		String seq = request.getParameter("seq");

		// 2. �����ͺ��̽� ���� ó��
		BoardVO vo = new BoardVO();				// vo ��ü ����
		vo.setSeq(Integer.parseInt(seq));		// vo�� ������ ����
		
		BoardDAO boardDAO = new BoardDAO();		// dao ��ü ����
		BoardVO board = boardDAO.getBoard(vo);	// dao���� ������(+������) �ҷ��ͼ� vo�� ����
		
		// 3. ���� ȭ�� ����
		ModelAndView mav = new ModelAndView();
		mav.addObject("board", board);
//		mav.setViewName("getBoard.jsp");
		mav.setViewName("getBoard");
		return mav;
//		HttpSession session = request.getSession();
//		session.setAttribute("board", board);
//		return "getBoard";
	}

}
