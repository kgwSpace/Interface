
public class Tmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HPPrinter hpPrn = new HPPrinter();
		SSPrinter ssPrn = new SSPrinter();
		
		hpPrn.initPrinter();
		hpPrn.printBlack("문서");
		
		ssPrn.initPrinter();
		ssPrn.printBlack("문서");
	}

}
