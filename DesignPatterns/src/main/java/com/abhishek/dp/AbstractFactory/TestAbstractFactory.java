package com.abhishek.dp.AbstractFactory;

public class TestAbstractFactory {

	public TestAbstractFactory() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		AbstractCountryFactory indiaFactory;
		
		indiaFactory = AbstractCountryFactory.getFactory(Country.INDIA);
		State westBengal = indiaFactory.getstate(StateCode.WB);
		westBengal.display();
		
		indiaFactory = AbstractCountryFactory.getFactory(Country.INDIA);
		State up = indiaFactory.getstate(StateCode.UP);
		up.display();
		
		
		
		AbstractCountryFactory usaFactory =null;
		
		usaFactory= AbstractCountryFactory.getFactory(Country.USA);
		State california = usaFactory.getstate(StateCode.CAL);
		california.display();
		
		
		usaFactory = AbstractCountryFactory.getFactory(Country.USA);
		State nevada = usaFactory.getstate(StateCode.NVD);
		nevada.display();
	}

}
