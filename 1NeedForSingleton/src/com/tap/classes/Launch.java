package com.tap.classes;

public class Launch {
	public static void main(String[] args) {
		IndianArmy ia = new IndianArmy();
		IndianNavy in = new IndianNavy();
		IndianAirforce iaf =  new IndianAirforce();
		
		ia.callPresident();
		in.callPresident();
		iaf.callPresident();
	}
}
