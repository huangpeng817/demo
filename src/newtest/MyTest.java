package newtest;

import java.util.Iterator;

import net.sf.json.JSONObject;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pj = "{\"name\":\"gu\",\"age\":24}";  
		JSONObject obj = JSONObject.fromObject(pj);//将json字符串转换为json对象  
//		JSONObject obj = new JSONObject().fromObject(pj);//将json字符串转换为json对象  
		Person p = new Person();
		for (Iterator iter = obj.keys(); iter.hasNext();) { //先遍历整个 people 对象  
		    String key = (String)iter.next();  
//		    obj.getString(key);
		    if (key.equals("name")) {
				p.setName(obj.getString(key));
			}
		    if (key.equals("age")) {
		    	p.setAge(Integer.parseInt(obj.getString(key)));
		    }
//		    System.out.println(key + "<----->" + obj.getString(key));  
		}
		System.out.println(p);
		
		
		
//        Person jb = (Person)JSONObject.toBean(obj,Person.class);//将建json对象转换为Person对象  
//        System.out.println(jb);
	}

}
