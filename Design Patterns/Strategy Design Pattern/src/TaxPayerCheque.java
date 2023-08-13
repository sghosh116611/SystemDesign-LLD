
public class TaxPayerCheque implements TaxPayerStrategy {

	@Override
	public void payTax() {
		System.out.println("Pay via cheque");
	}

}
