package tommy.spring.web.board;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import tommy.spring.web.board.impl.BoardDAO;

@Controller
public class GetBoardListController {

	@RequestMapping("/getBoardList.do")
//	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("�� ��� �˻� ó��");
		// 1. ����� �Է� ���� ����: �˻� ����� ���߿� ����
		
		// 2. �����ͺ��̽� ���� ó��
//		BoardVO vo = new BoardVO();
//		BoardDAO boardDAO = new BoardDAO();
//		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
		// 3. ���� ȭ�� ����
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("boardList", boardList);	// Model ��������
		mav.addObject("boardList", boardDAO.getBoardList(vo));	// Model ��������
//		//mav.setViewName("getBoardList.jsp");	// View ��������
//		mav.setViewName("getBoardList");		// View ��������
		mav.setViewName("getBoardList.jsp");		// View ��������
		return mav;
//		//HttpSession session = request.getSession();
//		//session.setAttribute("boardList", boardList);
//		//return "getBoardList";
	}

}
