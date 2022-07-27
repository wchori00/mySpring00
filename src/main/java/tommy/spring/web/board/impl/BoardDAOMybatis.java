package tommy.spring.web.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tommy.spring.web.board.BoardVO;
@Repository
public class BoardDAOMybatis {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
//	@Override
//	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
//		super.setSqlSessionFactory(sqlSessionFactory);
//	}
	public void insertBoard(BoardVO vo) {
		System.out.println("---> MyBatis�� insertBoard() ��� ó��");
//		getSqlSession().insert("BoardDAO.insertBoard", vo);
		sqlSessionTemplate.insert("BoardDAO.insertBoard", vo);
	}
	public void updateBoard(BoardVO vo) {
		System.out.println("---> MyBatis�� updateBoard() ��� ó��");
//		getSqlSession().update("BoardDAO.updateBoard", vo);
		sqlSessionTemplate.update("BoardDAO.updateBoard", vo);
	}
	public void deleteBoard(BoardVO vo) {
		System.out.println("---> MyBatis�� deleteBoard() ��� ó��");
//		getSqlSession().delete("BoardDAO.deleteBoard", vo);
		sqlSessionTemplate.delete("BoardDAO.deleteBoard", vo);
	}
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("---> MyBatis�� getBoard() ��� ó��");
//		return (BoardVO) getSqlSession().selectOne("BoardDAO.getBoard", vo);
		return (BoardVO) sqlSessionTemplate.selectOne("BoardDAO.getBoard", vo);
	}
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("---> MyBatis�� getBoardList() ��� ó��");
//		return getSqlSession().selectList("BoardDAO.getBoardList", vo);
//		return sqlSessionTemplate.selectList("BoardDAO.getBoardList", vo);
//		if(vo.getSearchCondition().equals("TITLE")) {
//			return sqlSessionTemplate.selectList("BoardDAO.getBoardList_T", vo);
//		}else if(vo.getSearchCondition().equals("CONTENT")) {
//			return sqlSessionTemplate.selectList("BoardDAO.getBoardList_C", vo);
//		}
//		return null;
		return sqlSessionTemplate.selectList("BoardDAO.getBoardList", vo);
	}
}
