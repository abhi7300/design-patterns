package com.abhishek.dp.AbstractFactory;

public class USAFactory extends AbstractCountryFactory {

	public USAFactory() {
		// TODO Auto-generated constructor stub
	}

	public State getstate(StateCode stateCode) {

		switch (stateCode) {

		case NVD:
			return new Nevada();
		case CAL:
			return new California();
		default:
			return null;

		}
	}

}
