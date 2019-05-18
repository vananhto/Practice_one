package domain.detail.task;

public class DriverDetail {
	private String driverCode;
	private String driverFullName;
	private int driverMobileNo;
	private int driverIdNo;
	
	public DriverDetail(String driverCode, String driverFullName, int driverMobileNo, int driverIdNo){
		this.driverCode = driverCode;
		this.driverFullName = driverFullName;
		this.driverMobileNo = driverMobileNo;
		this.driverIdNo = driverMobileNo;
	}
	
	public String getDriverCode() {
		return driverCode;
	}
	
	public String getDriverFullName() {
		return driverFullName;
	}
	
	public int getDriverMobileNo() {
		return driverMobileNo;
	}
	
	public int getDriverIdNo() {
		return driverIdNo;
	}
	
	
}
