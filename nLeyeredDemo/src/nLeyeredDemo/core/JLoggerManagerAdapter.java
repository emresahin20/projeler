package nLeyeredDemo.core;

import nLeyeredDemo.JLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String massage) {
		
		JLoggerManager manager = new JLoggerManager();	
		manager.log(massage);
	}

}
