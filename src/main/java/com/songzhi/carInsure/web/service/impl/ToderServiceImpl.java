package com.songzhi.carInsure.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songzhi.carInsure.web.dao.TCarMapper;
import com.songzhi.carInsure.web.dao.TOrderMapper;
import com.songzhi.carInsure.web.po.TCar;
import com.songzhi.carInsure.web.po.TCarExample;
import com.songzhi.carInsure.web.po.TOrder;
import com.songzhi.carInsure.web.po.TOrderExample;
import com.songzhi.carInsure.web.po.TOrderExample.Criteria;
import com.songzhi.carInsure.web.service.ToderService;

@Service("toderService")
public class ToderServiceImpl implements ToderService {

	@Autowired
	private TOrderMapper torderMapper;
	@Autowired
	private TCarMapper tcarMapper;
	
	
	@Override
	public int insert(TOrder record) throws Exception {
		// TODO Auto-generated method stub
		
		return torderMapper.insert(record);
	}
	@Override
	public int insert(TCar record) throws Exception {
		// TODO Auto-generated method stub
		return tcarMapper.insert(record);
	}
	
	@Override
	public int checkIncludeIDIsValid(String includeid) throws Exception {
		// TODO Auto-generated method stub
		int iTemp=0;
		
		if(!"".equals(includeid) && null!=includeid) {
			TOrderExample example = new TOrderExample();
			Criteria cri = example.createCriteria();
			cri.andVinEqualTo(includeid);
			
			iTemp = torderMapper.countByExample(example);
		}
		
		return iTemp;
	}
	
	
	@Override
	public TOrder getOrderByIncludeID(String includeid) throws Exception {
		// TODO Auto-generated method stub
		TOrder tOrder=null;
		
		if(!"".equals(includeid) && null!=includeid) {
			TOrderExample example = new TOrderExample();
			Criteria cri = example.createCriteria();
			cri.andVinEqualTo(includeid);
			
			List<TOrder> list=torderMapper.selectByExample(example);
			
			if(list.size()>0) {
				tOrder = list.get(0);
			}
			
		}
		
		return tOrder;
	}
	
	@Override
	public int selectCountByVin(String vin) throws Exception {
		// TODO Auto-generated method stub
		int iTemp=0;
		
		if(!"".equals(vin) && null!=vin) {
			TOrderExample example = new TOrderExample();
			Criteria cri = example.createCriteria();
			cri.andVinEqualTo(vin);	
			iTemp = torderMapper.countByExample(example);
		}
		
		return iTemp;
	}
	
	@Override
	public int updateOrder(TOrder record,TOrderExample example) throws Exception {
		// TODO Auto-generated method stub

		return torderMapper.updateByExample(record, example);
	}
	
	@Override
	public int updateOrder(TOrder record) throws Exception {
		// TODO Auto-generated method stub
		
		return torderMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public int updateCar(TCar record, TCarExample example) throws Exception {
		
		// TODO Auto-generated method stub
		return tcarMapper.updateByExample(record, example);
	}
	
	
 
}
