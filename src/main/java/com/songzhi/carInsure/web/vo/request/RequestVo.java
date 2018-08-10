package com.songzhi.carInsure.web.vo.request;

public class RequestVo {
	    //报文头
		private Head head;
		//报文内容
		private Body body;
		
		private OrdBody ordBody;
		
		public Head getHead() {
			return head;
		}

		public void setHead(Head headVo) {
			this.head = headVo;
		}

		public Body getBody() {
			return body;
		}

		public void setBody(Body bodyVo) {
			this.body = bodyVo;
		}

		public OrdBody getOrdBody() {
			return ordBody;
		}

		public void setOrdBody(OrdBody ordBody) {
			this.ordBody = ordBody;
		}
		
}
