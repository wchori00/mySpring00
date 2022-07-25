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
		System.out.println("글 목록 검색 처리");
		// 1. 사용자 입력 정보 추출: 검색 기능은 나중에 구현
		
		// 2. 데이터베이스 연동 처리
//		BoardVO vo = new BoardVO();
//		BoardDAO boardDAO = new BoardDAO();
//		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
		// 3. 응답 화면 구성
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("boardList", boardList);	// Model 정보저장
		mav.addObject("boardList", boardDAO.getBoardList(vo));	// Model 정보저장
//		//mav.setViewName("getBoardList.jsp");	// View 정보저장
//		mav.setViewName("getBoardList");		// View 정보저장
		mav.setViewName("getBoardList.jsp");		// View 정보저장
		return mav;
//		//HttpSession session = request.getSession();
//		//session.setAttribute("boardList", boardList);
//		//return "getBoardList";
	}

}
