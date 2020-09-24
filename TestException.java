package wrapperPackage;

public class TestException {
	
	public static int[] getArray() {
		return null;
	}

	public static void main(String[] args) {
		
		Boolean b=new Boolean(true);
		
		int index=1;
		try {
			getArray();
		}
		catch(Exception e) {
			System.out.println("heys ");
		}
		System.out.println(index);
		String s="MINIMUM";
		System.out.println(s.substring(3,8));
	}
	

}
