package learning;

public class StringReplaceALLcheck {

	public static void main(String[] args) {
		String test="A is always good than B CHECK";
		
		test=test.replaceAll("A", "ZXC");
		System.out.println(test);
		test=test.replaceAll("B", "YXC");
		System.out.println(test);
		test=test.replaceAll("CHECK", "HHACK");
		System.out.println(test);

	}

}
