package com.niit.oracle.model;

import java.util.Date;

public class OutputMessage extends Message 
{
	private Date time;

	public OutputMessage(Message message, Date date) {
		// TODO Auto-generated constructor stub
		super(message.getMessage(), message.getId());
		
		setTime(time);
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
