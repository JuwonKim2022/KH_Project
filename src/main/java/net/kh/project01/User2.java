package net.kh.project01;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class User2 {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date birth;
	private String sns;
	private Date reg_date;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User2 user2 = (User2) o;
		return id.equals(user2.id) && Objects.equals(pwd, user2.pwd) && Objects.equals(name, user2.name) && Objects.equals(email, user2.email) && Objects.equals(birth, user2.birth) && Objects.equals(sns, user2.sns);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, pwd, name, email, birth, sns);
	}

	@Override
	public String  toString() {
		return "User2{" +
				"id='" + id + '\'' +
				", pwd='" + pwd + '\'' +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", birth=" + birth +
				", sns='" + sns + '\'' +
				", reg_date=" + reg_date +
				'}';
	}

	public User2(){}
	public User2(String id, String pwd, String name, String email, Date birth, String sns, Date reg_date) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.birth = birth;
		this.sns = sns;
		this.reg_date = reg_date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getSns() {
		return sns;
	}

	public void setSns(String sns) {
		this.sns = sns;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
}
