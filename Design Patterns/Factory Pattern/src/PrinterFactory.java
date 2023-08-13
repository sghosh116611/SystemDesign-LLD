
public class PrinterFactory {

	public Printer getPrinter(String printer) {
		switch (printer) {
		case "welcome":
			return new WelcomePrinter();
		case "menu":
			return new MenuPrinter();
		case "goodbye":
			return new GoodByePrinter();
		default:
			return null;
		}
	}

}
