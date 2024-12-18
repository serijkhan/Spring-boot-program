package in.sameer.service;

import org.springframework.stereotype.Service;

//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoggerService {
	
	public void UserService() {
		log.debug("this is debug");
		log.error("this is error");
		log.info("this is info");
		log.trace("this is trace");
		log.warn("this is warn");
	}

}
