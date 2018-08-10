package com.songzhi.carInsure.service.vo.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.songzhi.carInsure.service.vo.bean.BasePart;
import com.songzhi.carInsure.service.vo.bean.VehicleModelObject;

/**
 * 响应头信息
 *
 */
public class ResponseBody {

	
	//JY报文流水号
	private String jySerialBum;	
		
	private BasePart base_part;
	
	private List<VehicleModelObject> vehicleModelObjectList;

	@XmlElement(name = "C_JY_SERIAL_BUM") 
	public String getJySerialBum() {
		return jySerialBum;
	}

	public void setJySerialBum(String jySerialBum) {
		this.jySerialBum = jySerialBum;
	}
	
	@XmlElement(name = "BASE_PART")  
	public BasePart getBase_part() {
		return base_part;
	}

	public void setBase_part(BasePart base_part) {
		this.base_part = base_part;
	}
		
	
    @XmlElementWrapper(name = "VEHICLE_LIST")  
    @XmlElement(name = "VEHICLE") 
	public List<VehicleModelObject> getVehicleModelObjectList() {
		return vehicleModelObjectList;
	}

	public void setVehicleModelObjectList(
			List<VehicleModelObject> vehicleModelObjectList) {
		this.vehicleModelObjectList = vehicleModelObjectList;
	}
	


}
