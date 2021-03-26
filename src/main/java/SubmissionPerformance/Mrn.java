package SubmissionPerformance;

import java.util.Random;

public class Mrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int n = 100000 + random_float() * 900000;
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder((100000 + rnd.nextInt(900000)) + "A");
		for (int i = 0; i < 5; i++)
		    sb.append(chars[rnd.nextInt(chars.length)]);
System.out.println("random"+sb);
		//return sb.toString();
	}

}
