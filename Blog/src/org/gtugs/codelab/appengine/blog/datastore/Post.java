package org.gtugs.codelab.appengine.blog.datastore;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Post {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private Date date;
	
	@Persistent
	private String title;
	
	@Persistent
	private String content;
	
	public Post() {}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date)
	{
		this.date = date;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
			this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

}
