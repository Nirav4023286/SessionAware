package p;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class NextAction extends ActionSupport implements SessionAware {
Map m;

@Override
public void setSession(Map m) {
this.m=m;	
}
public String execute(){
	return SUCCESS;
}
}
