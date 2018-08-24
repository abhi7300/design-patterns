package com.abhishek.dp.AbstractFactory;

public abstract class AbstractCountryFactory {

	public static AbstractCountryFactory getFactory(Country country) {

		switch (country) {

		case INDIA:
			return new IndiaFactory();
		case USA:
			return new USAFactory();
		default:
			return null;

		}


	}
	
	public abstract State getstate(StateCode stateCode);

}
