package week05;

public class App {
	
	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		logger.log("Hellow!");
		logger.error("ASTERISK!");
		logger = new SpacedLogger();
		logger.log("Harrow");
		logger.error("Spaced Memes.");
	}
}
