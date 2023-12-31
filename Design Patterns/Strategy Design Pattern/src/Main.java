
public class Main {

	public static void main(String[] args) {

		// Merchant A pays via Cheque
		TaxPayer merchantA = new MerchantA(new TaxPayerCheque());

		// Merchant B pays via Cash
		TaxPayer merchantB = new MerchantB(new TaxPayerCash());

		// Merchant C pays via Cheque
		TaxPayer merchantC = new MerchantC(new TaxPayerCheque());

		System.out.println("Merchant A ->");
		merchantA.payTax();
		System.out.println("Merchant B ->");
		merchantB.payTax();
		System.out.println("Merchant C ->");
		merchantC.payTax();
	}

}
