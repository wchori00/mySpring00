package tommy.spring.web.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tommy.spring.web.board.impl.BoardDAO;
import tommy.spring.web.controller.Controller;

public class GetBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 상세 보기 처리");
		// 1. 검색할 게시글 번호 추출
		String seq = request.getParameter("seq");

		// 2. 데이터베이스 연동 처리
		BoardVO vo = new BoardVO();				// vo 객체 생성
		vo.setSeq(Integer.parseInt(seq));		// vo에 시퀀스 저장
		
		BoardDAO boardDAO = new BoardDAO();		// dao 객체 생성
		BoardVO board = boardDAO.getBoard(vo);	// dao에서 데이터(+시퀀스) 불러와서 vo에 저장
		
		// 3. 응답 화면 구현
		HttpSession session = request.getSession();
		session.setAttribute("board", board);
		return "getBoard";
	}

}
