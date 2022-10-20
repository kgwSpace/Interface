
public class Tmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HPPrinter hpPrn = new HPPrinter();
		//SSPrinter ssPrn = new SSPrinter();
		Printable[] prns = new Printable[2];
		
		
		prns[0] = new HPPrinter();
		prns[1] = new SSPrinter();
		
		//hpPrn.initPrinter();
		//ssPrn.initPrinter();
		prns[0].initPrinter();
		prns[1].initPrinter();
		
		//hpPrn.printBlack("문서");
		//ssPrn.printBlack("문서");
		prns[0].printBlack("문서");
		prns[1].printBlack("문서");
	}

}
