package loginDAO.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STATE")
public class State {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Abbrev")
	private String abbrev;

	@Column(name = "LastModified")
	private Date lastModified;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrev() {
		return abbrev;
	}

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}


	
}
