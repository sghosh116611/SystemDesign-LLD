
public class DebugLogger extends LogProcessor {

	public DebugLogger(LogProcessor nextProcessor) {
		super(nextProcessor);
	}

	public void log(int logLevel, String message) {
		if (logLevel == DEBUG) {
			System.out.println(message);
		} else {
			super.log(logLevel, message);
		}
	}

}
