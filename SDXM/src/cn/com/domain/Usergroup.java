package cn.com.domain;
// Generated 2017-9-19 16:11:32 by Hibernate Tools 3.4.0.CR1

/**
 * Usergroup generated by hbm2java
 */
public class Usergroup implements java.io.Serializable {

	private int id;
	private int groupname;
	private String isDelete="0";
	private String groupcode;
	private int authority;

	public Usergroup() {
	}

	public Usergroup(int id) {
		this.id = id;
	}

	public Usergroup(int id, int groupname, String isDelete, String groupcode, int authority) {
		this.id = id;
		this.groupname = groupname;
		this.isDelete = isDelete;
		this.groupcode = groupcode;
		this.authority = authority;
	}

	public Usergroup(int groupname, String groupcode, int authority) {
		this.groupname = groupname;
		this.groupcode = groupcode;
		this.authority = authority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGroupname() {
		return groupname;
	}

	public void setGroupname(int groupname) {
		this.groupname = groupname;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getGroupcode() {
		return groupcode;
	}

	public void setGroupcode(String groupcode) {
		this.groupcode = groupcode;
	}

	public int getAuthority() {
		return authority;
	}

	public void setAuthority(int authority) {
		this.authority = authority;
	}
}
