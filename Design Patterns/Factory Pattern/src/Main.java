
public class Main {

	public static void main(String[] args) {
		PrinterFactory printerFactory = new PrinterFactory();
		Printer welcomePrinter = printerFactory.getPrinter("welcome");
		Printer menuPrinter = printerFactory.getPrinter("menu");
		Printer goodbyePrinter = printerFactory.getPrinter("goodbye");
		welcomePrinter.print();
		menuPrinter.print();
		goodbyePrinter.print();
	}
}
