package com.songzhi.carInsure.web.vo.response;

public class ResponseVO {	
	    // 响应业务状态码
		private Integer responseCode;
		// 响应业务信息
		private String responseMsg;
		// 响应数据
		private Object responseObj;

		public Integer getResponseCode() {
			return responseCode;
		}

		public void setResponseCode(Integer responseCode) {
			this.responseCode = responseCode;
		}

		public String getResponseMsg() {
			return responseMsg;
		}

		public void setResponseMsg(String responseMsg) {
			this.responseMsg = responseMsg;
		}

		public Object getResponseObj() {
			return responseObj;
		}

		public void setResponseObj(Object responseObj) {
			this.responseObj = responseObj;
		}
}
