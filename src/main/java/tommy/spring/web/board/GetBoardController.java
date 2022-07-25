package tommy.spring.web.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tommy.spring.web.board.impl.BoardDAO;

@Controller
public class GetBoardController {

	@RequestMapping("/getBoard.do")
//	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	//public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("�� �� ���� ó��");
		// 1. �˻��� �Խñ� ��ȣ ����
//		String seq = request.getParameter("seq");

		// 2. �����ͺ��̽� ���� ó��
//		BoardVO vo = new BoardVO();				// vo ��ü ����
//		vo.setSeq(Integer.parseInt(seq));		// vo�� ������ ����
		
//		BoardDAO boardDAO = new BoardDAO();		// dao ��ü ����
//		BoardVO board = boardDAO.getBoard(vo);	// dao���� ������(+������) �ҷ��ͼ� vo�� ����
		
		// 3. ���� ȭ�� ����
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("board", board);
		mav.addObject("board", boardDAO.getBoard(vo));
//		//mav.setViewName("getBoard.jsp");
//		mav.setViewName("getBoard");
		mav.setViewName("getBoard.jsp");
		return mav;
//		//HttpSession session = request.getSession();
//		//session.setAttribute("board", board);
//		//return "getBoard";
	}

}
