
public class Main {

	public static void main(String[] args) {
		LogProcessor logProcessor = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
		logProcessor.log(LogProcessor.INFO, "Info message");
		logProcessor.log(LogProcessor.ERROR, "Error message");
		logProcessor.log(LogProcessor.DEBUG, "Debug message");
	}

}
