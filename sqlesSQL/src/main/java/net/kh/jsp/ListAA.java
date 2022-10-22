package net.kh.jsp;

public class ListAA {
private String memberid;
private String memberpwd;
private String membername;
private String email;
public ListAA(String memberid,String memberpwd,String membername) {
	this.memberid=memberid;
	this.memberid=memberpwd;
	this.memberid=membername;
}
public ListAA(String memberid,String memberpwd,String membername,String email) {
	this.memberid=memberid;
	this.memberid=memberpwd;
	this.memberid=membername;
	this.email=email;
}
public String getMemberid() {
	return memberid;
}
public void setMemberid(String memberid) {
	this.memberid = memberid;
}
public String getMemberpwd() {
	return memberpwd;
}
public void setMemberpwd(String memberpwd) {
	this.memberpwd = memberpwd;
}
public String getMembername() {
	return membername;
}
public void setMembername(String membername) {
	this.membername = membername;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
