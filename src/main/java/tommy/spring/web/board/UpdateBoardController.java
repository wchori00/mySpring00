package tommy.spring.web.board;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import tommy.spring.web.board.impl.BoardDAO;

@Controller
public class UpdateBoardController {
	@RequestMapping("/updateBoard.do")
//	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ���� ��� ó��");
		// 1. ����� �Է� ���� ����
		//request.setCharacterEncoding("UTF-8");
//		String title = request.getParameter("title");
//		String content = request.getParameter("content");
//		String seq = request.getParameter("seq");
		
		// 2. �����ͺ��̽� ���� ó��
//		BoardVO vo = new BoardVO();
//		vo.setTitle(title);
//		vo.setContent(content);
//		vo.setSeq(Integer.parseInt(seq));
//		
//		BoardDAO boardDAO = new BoardDAO();
		boardDAO.updateBoard(vo);
		
		// 3. ȭ�� �׺���̼�
//		ModelAndView mav = new ModelAndView();
//		//mav.setViewName("getBoardList.do");
//		mav.setViewName("redirect:getBoardList.do");
//		return mav;
		return "getBoardList.do";
	}
}
