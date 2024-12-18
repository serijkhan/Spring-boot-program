package in.sameerit.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.sameerit.comtroller.UserController;

@ControllerAdvice
public class AppExceptionHandler {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@ExceptionHandler(value=ArithmeticException.class)
	public String handleAE(ArithmeticException ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "errorPage";
	
	}	

}
