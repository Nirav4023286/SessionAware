package p;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogingEx extends ActionSupport implements SessionAware{
private String uname,age,contactno,country;
	Map m;

public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public void setSession(Map arg0) {
		// TODO Auto-generated method stub
		this.m=m;
	}
	
@SuppressWarnings("unchecked")
public String execute(){
	m.put("a",uname);
	m.put("b",age);
	m.put("c",contactno);
	m.put("d",country);
	return SUCCESS;
}
}
