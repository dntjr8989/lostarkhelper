package com.kws.lostarkhelper;

import com.kws.lostarkhelper.lostarkapi.LostArkAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class LostarkhelperApplication {

	public static void main(String[] args) {
		LostArkAPI lostArkAPI = new LostArkAPI();
		lostArkAPI.callAPI();
		//SpringApplication.run(LostarkhelperApplication.class, args);
	}

}
