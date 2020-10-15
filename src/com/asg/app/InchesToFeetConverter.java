package com.asg.app;

public class InchesToFeetConverter {

	public void convert(int inches) {
		if(inches < 0) {
			System.out.println("Invalid value");
		}else {
			int feetValue = inches/12;
			int inchesValue = inches%12;
			System.out.printf("%d\' %d\"%n",feetValue,inchesValue);
		}
	}
	
}
