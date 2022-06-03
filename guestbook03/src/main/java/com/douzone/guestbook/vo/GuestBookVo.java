package com.douzone.guestbook.vo;

public class GuestBookVo {
	private Long no;
	private String name;
	private String password;
	private String message;
	private String reg_date;
	public Long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "게스트북no = " + no + ", 이름 = " + name + ", 비밀번호 = " + password + ", 메시지 = " + message
				+ ", 등록일 = " + reg_date + "]";
	}
}
