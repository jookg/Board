package com.joo.oop.domain;

public class BoardBean {
	private String regdate,writer,title,content;
	private int seq;
	public void setRegdate(String date){
		this.regdate=date;
	}
	public String getRegdate(){
		return regdate;
	}
	public void setWriter(String writer){
		this.writer=writer;
	}
	public String getWriter(){
		return writer;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setSeq(int seq){
		this.seq=seq;
	}
	public int getSeq(){
		return seq;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return content;
	}
	public String toString(){
		return String.format("글번호 %d | 작성자 %s | 제목 %s | 작성일 %s \n 내용 %s", seq,writer,title,regdate,content);
	}
}
