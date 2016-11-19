package com.fatih.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//JAXB kullanýmý için @XmlRootElement kullanýlýr
//@XmlRootElement içerisindeki name parametresi url eklenecek parametredir.
//JAXB kullanýrken no arg constructor mutlaka olmalýdýr.
@XmlRootElement(name="player")
public class Message {
	
	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	private String text;
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Message(String name, String text) {
		super();
		this.name = name;
		this.text = text;
	}
	
	

}
