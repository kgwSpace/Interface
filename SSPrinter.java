
public class SSPrinter implements Printable{
	public boolean initPrinter() {
		System.out.println("SSPrinter init");
		return true;
	}
	
	//기본값이 defalut라고 되어있기 때문에 public을 명시해 주어야 한다.
	public boolean printBlack(String doc) {
		System.out.println("SSPrinter Black Print"+doc);
		return true;
	}
}
