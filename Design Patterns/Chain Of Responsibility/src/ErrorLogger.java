
public class ErrorLogger extends LogProcessor {

	public ErrorLogger(LogProcessor nextProcessor) {
		super(nextProcessor);
	}

	public void log(int logLevel, String message) {
		if (logLevel == ERROR) {
			System.out.println(message);
		} else {
			super.log(logLevel, message);
		}
	}
}
