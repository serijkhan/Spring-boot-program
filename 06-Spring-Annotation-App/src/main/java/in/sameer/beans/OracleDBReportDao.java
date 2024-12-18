package in.sameer.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracledao")
public class OracleDBReportDao implements ReportDao{
	
	public void getData() {
		System.out.println("getting data from oracle db...");
	}

}
