package com.cts.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro; //to read propertied we have properties class , create object for it
	
	//condtructor to load config file
	public ReadConfig()
	{
		File src = new File(".//Configuration//config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch (Exception e) {
			System.out.println("Exception isMot able to load config file >>" + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("CTSURL");
		return url;
	}
	
	public String getQAURL() {
		String qaurl = pro.getProperty("QAURL");
		return qaurl;
		 
	}

	public String getUsername() {
		String uname = pro.getProperty("username");
		return uname;
	}

	public String getPassword() {
		String pword = pro.getProperty("password");
		return pword;
	}

	public String getChromePath() {
		String chrome = pro.getProperty("chromepath");
		return chrome;
	}

	public String getFirefoxPath() {
		String firefox =  pro.getProperty("firefoxpath");
		return firefox;
	}

	public String getIEPath() {
		String IE = pro.getProperty("iepath");
		return IE;
	}
	
}
