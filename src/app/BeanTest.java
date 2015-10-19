package app;

import bean.Person;
import bean.impl.Chinese;

public class BeanTest {

	public static void main(String[] args) {
		Person p = new Chinese();
		p.useAxe();
	}

}
