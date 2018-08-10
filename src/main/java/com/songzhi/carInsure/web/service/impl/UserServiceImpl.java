package com.songzhi.carInsure.web.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songzhi.carInsure.web.constants.SessionConstants;
import com.songzhi.carInsure.web.dao.TUserMapper;
import com.songzhi.carInsure.web.po.TUser;
import com.songzhi.carInsure.web.po.TUserExample;
import com.songzhi.carInsure.web.po.TUserExample.Criteria;
import com.songzhi.carInsure.web.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private TUserMapper userMapper;

	public TUser selectById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	public List<TUser> selectList(TUser record) throws Exception {
		// TODO Auto-generated method stub
		TUserExample example = new TUserExample();

		Criteria cri = example.createCriteria();
		cri.andIdEqualTo(record.getId());
		cri.andUsernameEqualTo(record.getUsername());
		cri.andPasswordEqualTo(record.getPassword());
		cri.andSexEqualTo(record.getSex());
		cri.andPhoneEqualTo(record.getPhone());
		cri.andEmailEqualTo(record.getEmail());
		cri.andIdnumberEqualTo(record.getIdnumber());

		return userMapper.selectByExample(example);
	}

	public List<TUser> selectAllList() throws Exception {
		// TODO Auto-generated method stub
		TUserExample example = new TUserExample();
		return userMapper.selectByExample(example);
	}

	public int insert(TUser record) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}

	public int update(TUser record) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(record);
	}

	public int deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}

	//登录验证
	public Map<String, Object> login(String email, String password) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> errMsg = new HashMap<String, Object>();

		// 手机号码+密码验证
		TUserExample example = new TUserExample();
		Criteria cri = example.createCriteria();
		cri.andPhoneEqualTo(email);
		cri.andPasswordEqualTo(password);
		List<TUser> tUserList = userMapper.selectByExample(example);
		if (tUserList != null && tUserList.size() > 0) {
			TUser user = (TUser) tUserList.get(0);
			
			errMsg.put("userInfo", user);
			errMsg.put("errcode", "000");
			errMsg.put("errMsg", "登录成功!");
			return errMsg;
		}

		// 邮箱+密码验证
		example = new TUserExample();
		cri = example.createCriteria();
		cri.andEmailEqualTo(email);
		cri.andPasswordEqualTo(password);
		List<TUser> tUserList1 = userMapper.selectByExample(example);
		if (tUserList1 != null && tUserList1.size() > 0) {
			TUser user = (TUser) tUserList1.get(0);

			errMsg.put("userInfo", user);
			errMsg.put("errcode", "000");
			errMsg.put("errMsg", "登录成功!");
			return errMsg;
		}

		errMsg.put("errcode", "001");
		errMsg.put("errMsg", "账号或密码错误!");
		return errMsg;
	}
    
	//检测邮箱是否已注册
	public boolean checkEmailUnique(TUser record) throws Exception {
		// TODO Auto-generated method stub
		TUserExample example = new TUserExample();
		Criteria cri = example.createCriteria();
		cri.andEmailEqualTo(record.getEmail());
		if (null != record.getId()) {
			cri.andIdNotEqualTo(record.getId());
		}
		int cint = userMapper.countByExample(example);
		if (cint > 0) {
			return true;
		}
		return false;
	}

	//检测电话号码是否已注册
	public boolean checkPhoneUnique(TUser record) throws Exception {
		// TODO Auto-generated method stub
		TUserExample example = new TUserExample();
		Criteria cri = example.createCriteria();
		cri.andPhoneEqualTo(record.getPhone());
		if (null != record.getId()) {
			cri.andIdNotEqualTo(record.getId());
		}
		int cint = userMapper.countByExample(example);
		if (cint > 0) {
			return true;
		}
		return false;
	}
}
