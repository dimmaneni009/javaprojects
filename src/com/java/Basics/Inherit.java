
public class Inherit {   //main class
public static void main (String[] args) {
	re2 R = new re2();
	R.chill();
	R.paren();
	}
}
 public class re1{     //parent
	 void paren() {
		 System.out.println("parent");
	 }
 }
 
 
 public class re2 extends re1{      //child
	 void chill(){
		 System.out.println("child");
		 
	 }
 }