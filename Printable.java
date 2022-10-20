//인터페이스의 특징
//1. 구현부가 존재하지 않는다. == only 규약만을 제공한다.
//2. 인터페이스는 모두 public 이다.
//3. 상속과 동일한 메카니즘. (내부적으로) 하지만 코딩은 
//extends(확장)가 아닌, implement(구현)라고 한다.
//따라서 인터페이스는 '확장이 아닌 구현'이다.
//4. static은 선언도 가능하다.
public interface Printable {
	public static String OS_VERSION = "WINDOW 10";
	//프린터 초기화 인터페이스
	boolean initPrinter();
	
	//흑백 인쇄 인터페이스
	boolean printBlack(String doc);
	
}
