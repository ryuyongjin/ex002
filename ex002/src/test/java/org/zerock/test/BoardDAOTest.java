package org.zerock.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardDAOTest {
	private static final Logger logger =
			LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testCreate()throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("���ο� ���� �ֽ��ϴ�.");
		board.setContent("���ο� ���� �ֽ��ϴ�.");
		board.setWriter("user00");
		dao.create(board);
	}
	
	/*@Test
	public void testRead()throws Exception{
		logger.info(dao.read(1).toString());
	}*/
}