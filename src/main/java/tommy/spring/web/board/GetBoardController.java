package tommy.spring.web.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tommy.spring.web.board.impl.BoardDAO;
import tommy.spring.web.controller.Controller;

public class GetBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�� �� ���� ó��");
		// 1. �˻��� �Խñ� ��ȣ ����
		String seq = request.getParameter("seq");

		// 2. �����ͺ��̽� ���� ó��
		BoardVO vo = new BoardVO();				// vo ��ü ����
		vo.setSeq(Integer.parseInt(seq));		// vo�� ������ ����
		
		BoardDAO boardDAO = new BoardDAO();		// dao ��ü ����
		BoardVO board = boardDAO.getBoard(vo);	// dao���� ������(+������) �ҷ��ͼ� vo�� ����
		
		// 3. ���� ȭ�� ����
		HttpSession session = request.getSession();
		session.setAttribute("board", board);
		return "getBoard";
	}

}
