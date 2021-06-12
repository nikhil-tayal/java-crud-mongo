package io.restapi.notes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Notes")
public class Notes {
	@Id
	private Integer id;
	private String title;
	private String body;
	private String date;
	private String time;
	
	public Notes() {
	
	}
	
	public Notes(Integer id, String title, String body, String date, String time) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.date = date;
		this.time = time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
