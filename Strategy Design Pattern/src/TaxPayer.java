
public class TaxPayer {
	TaxPayerStrategy taxPayerStrategy;
	
	
	// Constructor D.I
	TaxPayer(TaxPayerStrategy taxPayerStrategy){
		this.taxPayerStrategy = taxPayerStrategy;
	}

	public void payTax() {
		this.taxPayerStrategy.payTax();
	}
}
