package tommy.spring.web.board;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import tommy.spring.web.board.impl.BoardDAO;

@Controller
public class DeleteBoardController {
	@RequestMapping("/deleteBoard.do")
//	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ���� ó��");
		// 1. ����� �Է� ���� ����
//		String seq = request.getParameter("seq");

		// 2. �����ͺ��̽� ���� ó��
//		BoardVO vo = new BoardVO();
//		vo.setSeq(Integer.parseInt(seq));
//		BoardDAO boardDAO = new BoardDAO();
		boardDAO.deleteBoard(vo);
		
		// 3. ȭ�� �׺���̼�
//		ModelAndView mav = new ModelAndView();
//		//mav.setViewName("getBoardList.do");
//		mav.setViewName("redirect:getBoardList.do");
//		return mav;
		return "getBoardList.do";
	}
}
