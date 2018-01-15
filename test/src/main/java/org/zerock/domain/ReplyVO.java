package org.zerock.domain;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zerock.controller.HomeController;

public class ReplyVO {
	private static final Logger logger = LoggerFactory.getLogger(ReplyVO.class);
	private Integer rno;
	private Integer bno;
	private String replytext;
	private String replyer;
	private Date regdate;
	private Date updatedate;
	
	public ReplyVO() { 
		logger.info("Default constructor in ReplyVO.....");
	}
	
	public ReplyVO(Integer rno, Integer bno, String replytext, String replyer, Date regdate, Date updatedate) {
		super();
		this.rno = rno;
		this.bno = bno;
		this.replytext = replytext;
		this.replyer = replyer;
		this.regdate = regdate;
		this.updatedate = updatedate;
	}
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getreplytext() {
		return replytext;
	}
	public void setreplytext(String replytext) {
		this.replytext = replytext;
	}
	public String getReplyer() {
		return replyer;
	}
	public void setReplyer(String replyer) {
		this.replyer = replyer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "ReplyVO [rno=" + rno + ", bno=" + bno + ", replytext=" + replytext + ", replyer=" + replyer
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
	
}
