package com.joo.oop.serviceImpl;

import java.util.Arrays;

import com.joo.oop.domain.BoardBean;
import com.joo.oop.service.BoardService;

public class BoardServiceImpl implements BoardService{
	BoardBean[] list;
	int seq;
	public BoardServiceImpl() {
		list = new BoardBean[seq];
		seq=0;
	}
	@Override
	public void writeBoard(BoardBean member) {
		list=Arrays.copyOf(list, list.length+1);
		member.setSeq(seq+1);
		list[seq++]=member;
	}

	@Override
	public BoardBean[] boardList() {
		return list;
	}

	@Override
	public BoardBean findBySeq(int seq) {
		BoardBean sBoard= null;
		for (int i = 0; i < list.length; i++) {
			if (seq==list[i].getSeq()) {
				sBoard=list[i];
				break;
			}
		}
		return sBoard;
	}

	@Override
	public BoardBean[] findByWriter(String writer) {
		int j=0,x=0;
		for (int i = 0; i < list.length; i++) {
			if (writer.equals(list[i].getWriter())) {
				x++;
			}
		}
		BoardBean[] sList=new BoardBean[x];
		for (int i = 0; i < list.length; i++) {
			if (writer.equals(list[i].getWriter())) {
				sList[j]=list[i];
				j++;
				if(x==j){
				break;
				}
			}
		}
		return sList;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return seq;
	}

	@Override
	public void updateContent(BoardBean member) {
		for (int i = 0; i < list.length; i++) {
			if (member.getSeq()==list[i].getSeq()) {
				list[i].setContent(member.getContent());
				break;
			}
		}
	}

	@Override
	public void delete(int seq) {
		int j=0;
		for (int i = 0; i < list.length; i++) {
			if(seq==list[i].getSeq()){
				j=list[i].getSeq();
				list[i]=list[list.length-1];
				list[i].setSeq(j);
				list=Arrays.copyOf(list,list.length-1);
				seq--;
				break;
			}
		}
	}

}
