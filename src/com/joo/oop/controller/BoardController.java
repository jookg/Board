package com.joo.oop.controller;

import javax.swing.JOptionPane;

import com.joo.oop.domain.BoardBean;
import com.joo.oop.service.BoardService;
import com.joo.oop.serviceImpl.BoardServiceImpl;

public class BoardController {

	public static void main(String[] args) {
		BoardBean bb=null;
		BoardService bs=new BoardServiceImpl();
		while(true){
			switch (JOptionPane.showInputDialog("0.종료 1.글작성 2.글목록 3.목록수 4.글변경 5.글삭제 6.검색(글번호) 7.검색(작성자)")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				bb=new BoardBean();
				bb.setWriter(JOptionPane.showInputDialog("작성자"));
				bb.setTitle(JOptionPane.showInputDialog("제목"));
				bb.setContent(JOptionPane.showInputDialog("내용"));
				bb.setRegdate(JOptionPane.showInputDialog("작성일"));
				bs.writeBoard(bb);
				JOptionPane.showMessageDialog(null, "게시완료");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, bs.boardList());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "목록수 "+bs.count()+"개");
				break;
			case "4":
				bb=new BoardBean();
				bb.setSeq(Integer.parseInt(JOptionPane.showInputDialog("수정할 글번호")));
				bb.setContent(JOptionPane.showInputDialog("바꿀 내용"));
				bs.updateContent(bb);
				JOptionPane.showMessageDialog(null, "변경완료");
				break;
			case "5":
				bs.delete(Integer.parseInt(JOptionPane.showInputDialog("삭제할 글번호")));
				JOptionPane.showMessageDialog(null, "삭제완료");
				break;
			case "6":
				JOptionPane.showMessageDialog(null, bs.findBySeq(Integer.parseInt(JOptionPane.showInputDialog("찾을 글번호"))));
				break;
			case "7":
				JOptionPane.showMessageDialog(null, bs.findByWriter(JOptionPane.showInputDialog("찾을 작성자")));
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력");
				break;
			}
		} 

	}

}
