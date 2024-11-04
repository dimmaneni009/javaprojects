package com.java.Modifiers;

class Protected {
	public static void main(String[] args) {
		Protected1 t = new Protected2();
		t.mec();

	}
}

class Protected1 {
	protected int d = 54;

	protected void mec() {
		System.out.println("protected1 method");

	}
}

class Protected2 extends Protected1 {
	protected int y = 1290;

 void mmec() {
		System.out.println("protected2 subclass");
	}
}
