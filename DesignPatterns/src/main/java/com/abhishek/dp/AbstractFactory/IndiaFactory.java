package com.abhishek.dp.AbstractFactory;

public class IndiaFactory extends AbstractCountryFactory {

	public State getstate(StateCode stateCode) {

		switch (stateCode) {

		case UP:
			return new UttarPradesh();
		case WB:
			return new WestBengal();
		default:
			return null;

		}


	}
	
}
