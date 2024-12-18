package in.sameer.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ReportService {
	
	public void ReportService() {
		log.info("Method started");
		
		try {
		 int i= 10/0;	
		}catch(Exception e) {
			log.error("some error occured");
			
		}
		log.info("Methods Ended");
	}

}
