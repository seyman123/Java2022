package kodlama.ioDemo.core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Maile loglama yapıldı : " + message);
		
	}

}
