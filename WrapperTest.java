package wrapperPackage;

public class WrapperTest {

	public static void main(String[] args) {
		Float d=new Float(6.9);
		System.out.println(d);
		StringBuilder sb=new StringBuilder("Yogi");
		char ch[]= {'o','k','l','m','n'};
		int arr[]= {1,2};
		//System.out.println(sb.append(ch,0,1));
		
		System.out.println(sb.insert(1, ch));
		
		System.out.println(sb.replace(1,1,"O"));
		
		String str="Yogi";
		StringBuilder sb1=new StringBuilder("Yogi");
		System.out.println(str.equals(sb));
		
		System.out.println("gogi"+sb);
		
		int df='a';
		System.out.println(df);
		System.out.println('a'==97);
	}

}
