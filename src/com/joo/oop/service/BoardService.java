package com.joo.oop.service;

import com.joo.oop.domain.BoardBean;

public interface BoardService {
	public void writeBoard(BoardBean member);
	public BoardBean[] boardList();
	public BoardBean findBySeq(int seq);
	public BoardBean[] findByWriter(String writer);
	public int count();
	public void updateContent(BoardBean member);
	public void delete(int seq);
}
