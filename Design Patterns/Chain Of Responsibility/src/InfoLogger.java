
public class InfoLogger extends LogProcessor {

	public InfoLogger(LogProcessor nextProcessor) {
		super(nextProcessor);
	}

	public void log(int logLevel, String message) {
		if (logLevel == INFO) {
			System.out.println(message);
		} else {
			super.log(logLevel, message);
		}
	}

}
