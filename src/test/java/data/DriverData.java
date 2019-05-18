package data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class DriverData {
	
	private static final DateFormat sdf = new SimpleDateFormat("MM_dd_HH_mm");
    //private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	public int pickRandomNumber(){
		Random ran = new Random();
		int n = ran.nextInt(101) + 10;
		n += 1;
		return n;
	}
	
	public int pickRandomNumber_2(){
		Random ran = new Random();
		int n = ran.nextInt(5) + 1;
		n += 1;
		return n;
	}
	
	public String getCurrentDatetime(){
		Date date1 = new Date();
        //System.out.println(sdf.format(date1));
        return sdf.format(date1);
	}
	
	public  String driverCode(){
		String driverCode = "TX-000-";
		driverCode = driverCode + getCurrentDatetime();
		return driverCode;
	}
	
	public String driverName(){
		String driverName = "Nguyễn Auto ";
		driverName = driverName + getCurrentDatetime();
		return driverName;
	}
	
	public String driverMobileNo(){
		Random ran = new Random();
		int n = ran.nextInt(900000000) + 100000000;
		n += 1;
		String driverMobileNo = "";
		driverMobileNo = driverMobileNo + n;
		return driverMobileNo;
	}
	
	public String driveriDNo(){
		Random ran = new Random();
		int n = ran.nextInt(900000000) + 100000000;
		n += 1;
		String idNo = "";
		idNo = idNo + n;
		return idNo;
	}
	
	public static void main(String[] args) {
		DriverData dd = new DriverData();
	 System.out.println("random number is : "+ dd.pickRandomNumber_2());
	}

}
