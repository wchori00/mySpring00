package tommy.spring.web.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tommy.spring.web.board.impl.BoardDAO;
import tommy.spring.web.controller.Controller;

public class UpdateBoardController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// 1. ����� �Է� ���� ����
		//request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String seq = request.getParameter("seq");
		
		// 2. �����ͺ��̽� ���� ó��
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.updateBoard(vo);
		
		// 3. ȭ�� �׺���̼�
		return "getBoardList.do";
	}
}
