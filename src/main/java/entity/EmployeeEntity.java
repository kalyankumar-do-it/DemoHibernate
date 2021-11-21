package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employee")
public class EmployeeEntity 
{
	@Id
	private int eid;
	private String eName;
	private String eDept;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return eName;
	}

	public void setEname(String eName) {
		this.eName = eName;
	}

	public String getDept() {
		return eDept;
	}

	public void setEdept(String eDept) {
		this.eDept = eDept;
	}

}
