package com.ms3.SQL;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LogFileParser {
	private FileInputStream stream;
	String regex = "(\\d{4}-\\d{2}-\\d{2}) (\\d{2}:\\d{2}:\\d{2},\\d{3}) \\[(.*)\\] ([^ ]*) +([^ ]*) - (.*)$";
	private List<String> s = new ArrayList<>();
	

	public String getResults() {
		try {
			stream = new FileInputStream("ms3log.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					stream));
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				s.add(str);
			}
			stream.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		Pattern p = Pattern.compile(regex);
		for(String string : s ) {
			Matcher m = p.matcher(string);
			if (m.matches() && m.groupCount() == 6) {
				String date = m.group(1);
				String time = m.group(2);
				String threadId = m.group(3);
				String priority = m.group(4);
				String category = m.group(5);
				String message = m.group(6);

				System.out.println("date: " + date);
				System.out.println("time: " + time);
				System.out.println("threadId: " + threadId);
				System.out.println("priority: " + priority);
				System.out.println("category: " + category);
				System.out.println("message: " + message);
			}
		}
		return null;
		
	}
}
