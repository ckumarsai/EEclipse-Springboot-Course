package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngg")
public class DeiselEngine  implements Engine {
	public DeiselEngine() {
		System.out.println("DeiselEngine: 0-param constructor");
	}
	@Override
	public void start() {
		System.out.println("DeiselEngine.start()");
	}
	@Override
	public void stop() {
		System.out.println("DeiselEngine.stop()");
	}

}
