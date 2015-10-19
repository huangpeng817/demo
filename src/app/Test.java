package app;

import net.sf.json.JSONObject;

public class Test {  
    public static void main(String[] args) {  
          
    	String pj = "{\"name\":\"gu\",\"num\":123456,\"sex\":\"male\",\"age\":24}";  
//    	ParseJson pj = new ParseJson("{\"name\":\"gu\",\"num\":123456,\"sex\":\"male\",\"age\":24}");  
    	
        //将字符串转换为json对象，然后根据建得到相应的值  
//        pj.parse();  
          
        //将一个json字符串转换为java对象  
//        Person p = pj.JSON2Object();  
    	JSONObject obj = new JSONObject().fromObject(pj);//将json字符串转换为json对象  
        Person jb = (Person)JSONObject.toBean(obj,Person.class);//将建json对象转换为Person对象  
        System.out.println(jb);
        
//        System.out.println("Name:" + p.getName());  
//        System.out.println("Num:" + p.getNum());  
//        System.out.println("Sex:" + p.getSex());  
//        System.out.println("age:" + p.getAge());  
          
        
        
        
        //将一个java对象转换为Json字符串  
//        Person p1 = new Person("gu1",123,"male",23);  
//        ConsJson cj = new ConsJson();  
//        String str1 = cj.Object2Json(p1);  
//        System.out.println(str1);  
          
    }  
  
}  