package bean.impl;

import bean.Axe;
import bean.Person;

public class Chinese implements Person {

	private Axe axe = new StoneAxe();
	
//	public void setAxe(Axe axe) {
//		this.axe = axe;
//	}
	
	@Override
	public void useAxe() {
		System.out.println(axe.chop());
	}

}
