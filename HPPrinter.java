//implement : 구현하다
//내부구조는 상속메카니즘과 다를 게 없다.
//하지만 키워드를 extends(확장되었다)라고 표현하면 의미가 이상해진다.

//HPPrinter는 Printable 안에 있는 내용을 반드시 구현해야 한다.
public class HPPrinter implements Printable{
	
	public boolean initPrinter() {
		System.out.println("HPPrinter init");
		return true;
	}
	
	//기본값이 defalut라고 되어있기 때문에 public을 명시해 주어야 한다.
	public boolean printBlack(String doc) {
		System.out.println("HPPrinter Black Print"+doc);
		return true;
	}
	
}
