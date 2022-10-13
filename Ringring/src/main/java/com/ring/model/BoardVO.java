package com.ring.model;

import java.util.ArrayList;

public class BoardVO {
	//MySQL의 board테이블
	//게시판번호 bno
	private int bno;
	//제목 title
	private String title;
	//내용 content
	private String content;
	//작성일자 regdate
	private String regdate;
	//조회수 count
	private int count;
	//id
	private String id;
	
	//좋아요 갯수
	private int lcnt;
	
	public int getLcnt() {
		return lcnt;
	}
	public void setLcnt(int lcnt) {
		this.lcnt = lcnt;
	}
	//AttachFileVO(파일 업로드 관련 Model), 배열
	private ArrayList<AttachFileVO> attach;
	
	//board
	private int b_no;		//고객센터 내 글 번호
	private String b_type;	//고객센터 글종류
	private String b_title;	//고객센터 글 제목
	private String b_content;	//고객센터 글 내용
	private String b_regdate;	//고객센터 글 작성시간
	
	//1:1 help 테이블
	private int h_no;				// 1:1 내 넘버
    private String h_type;			// 1:1 종류
    private String h_title;			// 1:1 제목
    private String h_id;			// 1:1 작성자 id
    private String h_email;			// 1:1 답변 메일
    private String h_content; 		// 1:1 내용
    private String h_regdate; 		// 1:1 등록날짜
    
    
    public int getH_no() {
		return h_no;
	}
	public void setH_no(int h_no) {
		this.h_no = h_no;
	}
	public String getH_type() {
		return h_type;
	}
	public void setH_type(String h_type) {
		this.h_type = h_type;
	}
	public String getH_title() {
		return h_title;
	}
	public void setH_title(String h_title) {
		this.h_title = h_title;
	}
	public String getH_id() {
		return h_id;
	}
	public void setH_id(String h_id) {
		this.h_id = h_id;
	}
	public String getH_email() {
		return h_email;
	}
	public void setH_email(String h_email) {
		this.h_email = h_email;
	}
	public String getH_content() {
		return h_content;
	}
	public void setH_content(String h_content) {
		this.h_content = h_content;
	}
	public String getH_regdate() {
		return h_regdate;
	}
	public void setH_regdate(String h_regdate) {
		this.h_regdate = h_regdate;
	}
	public int getH_answer() {
		return h_answer;
	}
	public void setH_answer(int h_answer) {
		this.h_answer = h_answer;
	}
	private int h_answer;			// 1:1 답변등록 여부
	
	
	
			
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getB_type() {
		return b_type;
	}
	public void setB_type(String b_type) {
		this.b_type = b_type;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public String getB_regdate() {
		return b_regdate;
	}
	public void setB_regdate(String b_regdate) {
		this.b_regdate = b_regdate;
	}
	//getter&setter 메소드
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//AttachFileVO의 getter&setter
	public ArrayList<AttachFileVO> getAttach() {
		return attach;
	}
	public void setAttach(ArrayList<AttachFileVO> attach) {
		this.attach = attach;
	}
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", regdate=" + regdate + ", count="
				+ count + ", id=" + id + ", lcnt=" + lcnt + ", attach=" + attach + ", b_no=" + b_no + ", b_type="
				+ b_type + ", b_title=" + b_title + ", b_content=" + b_content + ", b_regdate=" + b_regdate + ", h_no="
				+ h_no + ", h_type=" + h_type + ", h_title=" + h_title + ", h_id=" + h_id + ", h_email=" + h_email
				+ ", h_content=" + h_content + ", h_regdate=" + h_regdate + ", h_answer=" + h_answer + "]";
	}
	
}
