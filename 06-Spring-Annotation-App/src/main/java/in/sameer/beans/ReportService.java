package in.sameer.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	@Autowired
	@Qualifier("mysqldao")
	private ReportDao dao;
	
	/*public ReportService(ReportDao dao) {
		System.out.println("ReportService :: param-Constructor....");
		this.dao = dao;*/
	//}
	
	
	
	public void generateReport() {
		dao.getData();
		System.out.println("Report Generated");
	}
	

}
