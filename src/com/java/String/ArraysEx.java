package com.java.String;

public class ArraysEx {
	public static void main(String[] args) {

		int i[] = { 23, 24, 25, 26, 27 };

		int[] j = new int[5];
		j[0] = 1;
		j[1] = 2;
		j[4] = 3;

		j[0] = 6; //RE-Assign

		// System.out.println(j[0]);

		String k[] = new String[4];
		k[1] = "hello";

		System.out.println(k[1]);

		boolean m[] = new boolean[6];
		m[0]= false;
		m[1]= true;
		
		byte n[] = new byte[3];
		n[0]=25;

		float f[] = new float[2];
		f[0]=10.0f;

	}

}
