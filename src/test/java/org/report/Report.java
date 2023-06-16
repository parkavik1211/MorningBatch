package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Report {
	
	public static void createJvmReport(String jsonFilePath) {
		
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\Cucumber\\src\\test\\resources\\jvmReport");
		
		Configuration c  =new Configuration(f,"Facebook");
		c.addClassifications("platform name", "window");
		c.addClassifications("Platform version", "10");
		c.addClassifications("Browser Name", "Chrome");
		c.addClassifications("Browser Version", "98.0");
		c.addClassifications("Sprint no", "3");
		
		List<String>  l = new ArrayList<String>();
		l.add(jsonFilePath);
		
		ReportBuilder  r = new ReportBuilder(l, c);
		r.generateReports();
		

	}

}
