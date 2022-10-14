package week1.day2;

public class calculator2 {
	

    public int addTwoNumbers(int a,int b) {
		
		int c = a+b;
		return c;
	}
	public int substractTwoNumbers(int addTwoNumbers,int b) {
		
		int e = addTwoNumbers-b;
		return e;
	}
	 public static void main(String[] args) {
	    	calculator2 calc2=new calculator2();
	    	int addTwoNumbers = calc2.addTwoNumbers(45, 56);
	    	System.out.println(addTwoNumbers);
	    	calc2.substractTwoNumbers(addTwoNumbers, 76);
	    	
	    	
	 }
}
