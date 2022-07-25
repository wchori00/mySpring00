package tommy.spring.web.board;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import tommy.spring.web.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("����", "TITLE");
		conditionMap.put("����", "CONTENT");
		return conditionMap;
	}
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ��� ó��");
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ���� ��� ó��");
		System.out.println("��ȣ: " + vo.getSeq());
		System.out.println("����: " + vo.getTitle());
		System.out.println("�ۼ���: " + vo.getWriter());
		System.out.println("����: " + vo.getContent());
		System.out.println("�����: " + vo.getRegDate());
		System.out.println("��ȸ��: " + vo.getCnt());
		System.out.println("�ۼ��� �̸�: " + vo.getWriter());
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ���� ó��");
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("�� �� ���� ó��");
		model.addAttribute("board", boardDAO.getBoard(vo));
		return "getBoard.jsp";
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("�� ��� �˻� ó��");
		System.out.println("�˻� ����: " + vo.getSearchCondition());
		System.out.println("�˻� �ܾ�: " + vo.getSearchKeyword());
//		mav.addObject("boardList", boardDAO.getBoardList(vo));	// Model ��������
//		mav.setViewName("getBoardList.jsp");		// View ��������
		model.addAttribute("boardList", boardDAO.getBoardList(vo));
		return "getBoardList.jsp";
	}
	
}
