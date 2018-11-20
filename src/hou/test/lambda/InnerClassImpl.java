package hou.test.lambda;

public class InnerClassImpl{
	
	String a = "aaa";
	
	public InnerClassImpl(InnerClass inn) {
		inn.fly(a);
	}

	public static void main(String[] args) {
		
		InnerClassImpl impl = new InnerClassImpl(
				new InnerClass() {

					@Override
					public void fly(String a) {
						System.out.println("This is a example."+a);
						
					}
					
				});
		
		//InnerClassImpl impl1 = new InnerClassImpl( (String a) ->System.out.println("This is a example."));

	}

}
