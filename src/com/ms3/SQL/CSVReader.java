package com.ms3.SQL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 
/** * Simple Java program to read CSV file in Java. In this program we will read * list of books stored in CSV file as comma separated values. * * @author WINDOWS 8 * */ 
public class CSVReader { 
	private String A;
	private String B;
	private String C;
	private String D;
	private String E;
	private String F;
	private String G;
	private String H;
	private String I;
	private String J;
	
	public String getA() {
		return A;
	}

	public void setA(String a) {
		A = a;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		B = b;
	}

	public String getC() {
		return C;
	}

	public void setC(String c) {
		C = c;
	}

	public String getD() {
		return D;
	}

	public void setD(String d) {
		D = d;
	}

	public String getE() {
		return E;
	}

	public void setE(String e) {
		E = e;
	}

	public String getF() {
		return F;
	}

	public void setF(String f) {
		F = f;
	}

	public String getG() {
		return G;
	}

	public void setG(String g) {
		G = g;
	}

	public String getH() {
		return H;
	}

	public void setH(String h) {
		H = h;
	}

	public String getI() {
		return I;
	}

	public void setI(String i) {
		I = i;
	}

	public String getJ() {
		return J;
	}

	public void setJ(String j) {
		J = j;
	}
	public CSVReader(String a, String b, String c, String d, String e, String f, String g, String h, String i,
			String j) {
		super();
		A = a;
		B = b;
		C = c;
		D = d;
		E = e;
		F = f;
		G = g;
		H = h;
		I = i;
		J = j;
	}

	/*public static void main(String[] args) {
		
		String csvFile = "D:/WVU/Interviews/MS3/ms3Interview.csv";
		String line = "";
		String splitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
			String[] name = line.split(splitBy);
			System.out.print("FirstName: "+ name[0]+ " , LastName:" + name[1]+ " , Email:" + name[3]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}*/
}
