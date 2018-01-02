package com.test.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class jsonDemo {
	public int id;
	public int age;
	public String name;
	public String sex;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	 public String toString() {  
	        return "Person [id=" + id + ", name=" + name + ", age=" + age +"sex="+sex+ "]";  
	    }  
	 public static void main(String[] args){
		 List<jsonDemo> list=new ArrayList<jsonDemo>();
		 Gson gson = new Gson();
		 jsonDemo j = new jsonDemo();
		 j.setAge(10);
		 j.setName("jack");
		 j.setSex("boy");
		 j.setId(1);
		 list.add(j);
		 jsonDemo j1 = new jsonDemo();
		 j1.setAge(10);
		 j1.setName("tim");
		 j1.setSex("boy");
		 j1.setId(2);
		 list.add(j1);
		 Total nt = new Total(list.size(),list);
		 String str = gson.toJson(nt);
		 System.out.println(str);
	 }
}
class Total{
	 int total; 
	 List<jsonDemo> list; 
	public Total(int total, List<jsonDemo> list) {
			this.total = total;
			this.list = list;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public List<jsonDemo> getRows() {
			return list;
		}
		public void setRows(List<jsonDemo> list) {
			this.list = list;
		}
}


