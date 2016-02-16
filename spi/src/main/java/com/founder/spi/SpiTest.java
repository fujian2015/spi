package com.founder.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SpiTest {
	
	public static void main(String[] args) {
		ServiceLoader<SpiInterface> loader = ServiceLoader.load(SpiInterface.class);
		Iterator<SpiInterface> iterator = loader.iterator();
		while(iterator.hasNext()){
			iterator.next().print();
		}
	}

}
