package parentsPackage;

public class ParentsClass {
	// public 접근 제한자를 사용한 필드
	public String publicField;
	
	// protected 접근 제한자를 사용한 필드
	public String protectedField;

	public ParentsClass() {
		this.protectedField = "Public Field";
	}

	public void protectedMethod() {
		System.out.println("This is a public method");
	}

}
