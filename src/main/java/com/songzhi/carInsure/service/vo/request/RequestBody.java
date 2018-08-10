package com.songzhi.carInsure.service.vo.request;


import javax.xml.bind.annotation.XmlElement;

import com.songzhi.carInsure.service.vo.bean.VehicleModelObject;

/**
 * 请求报文body
 * 
 *
 */
public class RequestBody {
	
	private RequestBasePart basePart; 

	private VehicleModelObject vehicleObject;
	

	@XmlElement(name = "BASE_PART")
	public RequestBasePart getBasePart() {
		return basePart;
	}

	public void setBasePart(RequestBasePart basePart) {
		this.basePart = basePart;
	}

	@XmlElement(name = "VEHICLE")
	public VehicleModelObject getVehicleObject() {
		return vehicleObject;
	}

	public void setVehicleObject(VehicleModelObject vehicleObject) {
		this.vehicleObject = vehicleObject;
	}

}
