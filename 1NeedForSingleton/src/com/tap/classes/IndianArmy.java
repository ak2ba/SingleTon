package com.tap.classes;

import com.tap.interfaces.Service;

public class IndianArmy implements Service {

	@Override
	public void callPresident() {
		President p = new President();
		System.out.println("The President is : "+p.getName());
		System.out.println(p);
	}
}
