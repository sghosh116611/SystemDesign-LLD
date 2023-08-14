
public abstract class LogProcessor {

	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;

	LogProcessor nextProcessor;

	public LogProcessor(LogProcessor nextProcessor) {
		this.nextProcessor = nextProcessor;
	}

	public void log(int logLevel, String message) {
		if (nextProcessor != null) {
			nextProcessor.log(logLevel, message);
		}
	}

}
