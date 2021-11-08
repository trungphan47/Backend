package com.demoyourself;

import org.springframework.stereotype.Component;

//@Component
public class HappyFortune implements FortuneService {

	public String getFortuneService() {
		return "To day is a lucky day";
	}

}
