package com.founder.spi.impl;

import com.founder.spi.SpiInterface;

public class FirstSpiImpl implements SpiInterface {

	@Override
	public void print() {
		System.out.println(FirstSpiImpl.class+" called.");
	}

}
