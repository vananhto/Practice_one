package domain.builder.task;

import domain.detail.task.DriverDetail;

public class DriverDetailBuilder {
	private String driverCode;
	private String driverFullName;
	private Integer driverMobileNo;
	private Integer driverIdNo;
	
	public DriverDetailBuilder withDriverCode(String driverCode){
		this.driverCode = driverCode;
		return this;
	}
	
	public DriverDetailBuilder withDriverFullName(String driverFullName){
		this.driverFullName = driverFullName;
		return this;
	}
	
	public DriverDetailBuilder withDriverMobileNo(Integer driverMobileNo){
		this.driverMobileNo = driverMobileNo;
		return this;
	}
	
	public DriverDetailBuilder withDriverIdNo(Integer driverIdNo){
		this.driverIdNo = driverIdNo;
		return this;
	}
	
	public DriverDetail build(){
		return new DriverDetail (driverCode, driverFullName, driverMobileNo, driverIdNo);
	}
}
