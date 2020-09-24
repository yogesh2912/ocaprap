package wrapperPackage;

public class TypeBozo implements Bozo{
	
	

	public static void main(String[] args) {
		
			System.out.println(new TypeBozo().type);
			System.out.println(Bozo.type);
			System.out.println(TypeBozo.type=45);
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

}
