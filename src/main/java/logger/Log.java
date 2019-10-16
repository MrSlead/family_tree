package logger;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log {
	private final static Logger log = Logger.getLogger(Log.class);
	
	@Before("execution(* Person.*(..))")
	public void myadvice(JoinPoint jp) {
		System.out.println("You are can!");
	}

	public static Logger getLog() {
		return log;
	}
}
