package com.example.icommerce.services.impl;

import com.example.icommerce.services.Operation;

public class Calcul implements Operation{

	@Override
	public double add(float a, float b) {
		// TODO Auto-generated method stub
		double res = a + b;
		return res;
	}

	@Override
	public double mult(float a, float b) {
		// TODO Auto-generated method stub
		double res = a * b;
		return res;
	}

	@Override
	public double soust(float a, float b) {
		// TODO Auto-generated method stub
		double res = a - b;
		return res;
	}

}
