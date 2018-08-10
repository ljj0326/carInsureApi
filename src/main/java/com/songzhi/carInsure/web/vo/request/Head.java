package com.songzhi.carInsure.web.vo.request;

public class Head {
	    //接口编号
		private String trans_type;
		//用户名（接口使用者）
		private String user;
		//密码（接口使用者密码）
		private String password;
		//系统来源
		private String sysSource;
		//版本号
		private String version;
		//Token
		private String token;

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getTrans_type() {
			return trans_type;
		}

		public void setTrans_type(String trans_type) {
			this.trans_type = trans_type;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getSysSource() {
			return sysSource;
		}

		public void setSysSource(String sysSource) {
			this.sysSource = sysSource;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

}
