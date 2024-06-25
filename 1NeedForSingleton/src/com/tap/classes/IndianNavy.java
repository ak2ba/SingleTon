package com.tap.classes;

import com.tap.interfaces.Service;

public class IndianNavy implements Service {

	@Override
	public void callPresident() {
		President p = new President();
		System.out.println("The President is : "+p.getName());
		System.out.println(p);
	}
}