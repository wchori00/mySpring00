package tommy.spring.web.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import tommy.spring.web.board.impl.BoardDAO;

@Controller
public class InsertBoardController {
	@RequestMapping("/insertBoard.do")
//	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		// 1. 사용자 입력 정보 추출: 커맨드 객체가 자동으로 처리해 줌
		//request.setCharacterEncoding("UTF-8");
//		String title = request.getParameter("title");
//		String writer = request.getParameter("writer");
//		String content = request.getParameter("content");
		
		// 2. 데이터베이스 연동 처리
//		BoardVO vo = new BoardVO();
//		vo.setTitle(title);
//		vo.setWriter(writer);
//		vo.setContent(content);
		
//		BoardDAO boardDAO = new BoardDAO();
		boardDAO.insertBoard(vo);
		
		// 3. 화면 네비게이션
//		ModelAndView mav = new ModelAndView();
//		//mav.setViewName("getBoardList.do");
//		mav.setViewName("redirect:getBoardList.do");
//		return mav;
//		//return "getBoardList.do";
		return "getBoardList.do";
	}
}
