package domain.detail.task;

public class DriverDetail {
	private String driverCode;
	private String driverFullName;
	private Integer driverMobileNo;
	private Integer driverIdNo;
	
	public DriverDetail(String driverCode, String driverFullName, Integer driverMobileNo, Integer driverIdNo){
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
	
	public Integer getDriverMobileNo() {
		return driverMobileNo;
	}
	
	public Integer getDriverIdNo() {
		return driverIdNo;
	}
	
	
}
