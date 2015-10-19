package demo;

import app.Person;
import net.sf.json.JSONObject;

public class JsonStr2JavaObjectTest {
	public static void main(String[] args) {
		String pj = "{\"name\":\"gu\",\"age\":24}";  
//		String json = "{" + "\"age\":\"11\"," + "\"name\": \"liSI\"" 
//				+ "}";
//		System.out.println(json);
		
		
		
		
//		JSONObject obj = JSONObject.fromObject(json);
//		System.out.println(obj);
		
//		JSONObject obj = new JSONObject().fromObject(json);  
//		Person jb = (Person) JSONObject.toBean(obj,Person.class);
		JSONObject obj = new JSONObject().fromObject(pj);//将json字符串转换为json对象  
        Person jb = (Person)JSONObject.toBean(obj,Person.class);//将建json对象转换为Person对象  
        System.out.println(jb);
		
		System.out.println(jb.getName());
		
	}

	public class Person {

		private Integer age;
		private String name;
		
		public Person() {
			super();
		}
		

		public Person(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}

	}

}
