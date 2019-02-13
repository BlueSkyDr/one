package cn;

import java.util.Date;

import com.alibaba.fastjson.JSON;

class One{
	private Date dateOne;
	public Date getDateOne() {
		return dateOne;
	}
	public void setDateOne(Date dateOne) {
		this.dateOne = dateOne;
	}
	
}
public class Testrun {
public static void main(String[] args) {
	One one = new One();
	one.setDateOne(new Date());
	System.out.println(JSON.toJSONString(one));
}
}
