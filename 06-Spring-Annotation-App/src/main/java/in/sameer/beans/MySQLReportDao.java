package in.sameer.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqldao")
@Primary
public class MySQLReportDao implements ReportDao {
	
	public void getData() {
		System.out.println("getting data from MYSQL database..");
	}

}
