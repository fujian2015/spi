package com.founder.spi.impl;

import com.founder.spi.SpiInterface;

public class SecondSpiImpl implements SpiInterface {

	@Override
	public void print() {
		System.out.println(SecondSpiImpl.class+" called.");
	}

}
