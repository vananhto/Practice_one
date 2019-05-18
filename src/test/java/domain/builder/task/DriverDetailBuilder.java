package domain.builder.task;

import domain.detail.task.DriverDetail;

public class DriverDetailBuilder {
	private String driverCode;
	private String driverFullName;
	private int driverMobileNo;
	private int driverIdNo;
	
	public DriverDetailBuilder withDriverCode(String driverCode){
		this.driverCode = driverCode;
		return this;
	}
	
	public DriverDetailBuilder withDriverFullName(String driverFullName){
		this.driverFullName = driverFullName;
		return this;
	}
	
	public DriverDetailBuilder withDriverMobileNo(int driverMobileNo){
		this.driverMobileNo = driverMobileNo;
		return this;
	}
	
	public DriverDetailBuilder withDriverIdNo(int driverIdNo){
		this.driverIdNo = driverIdNo;
		return this;
	}
	
	public DriverDetail build(){
		return new DriverDetail (driverCode, driverFullName, driverMobileNo, driverIdNo);
	}
}
