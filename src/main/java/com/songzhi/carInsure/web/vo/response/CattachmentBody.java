package com.songzhi.carInsure.web.vo.response;

import java.sql.Date;

//附件明细
public class CattachmentBody {
	private int come_type;
	private int come_order;
	private int source_num;
	private int source_id;
	private String source_name;
	private String dest_name;
	private String dest_url;
	private Date create_time;
	private String creater;
	private int is_delete;

	public int getCome_type() {
		return come_type;
	}

	public void setCome_type(int come_type) {
		this.come_type = come_type;
	}

	public int getCome_order() {
		return come_order;
	}

	public void setCome_order(int come_order) {
		this.come_order = come_order;
	}

	public int getSource_num() {
		return source_num;
	}

	public void setSource_num(int source_num) {
		this.source_num = source_num;
	}

	public int getSource_id() {
		return source_id;
	}

	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}

	public String getSource_name() {
		return source_name;
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	public String getDest_name() {
		return dest_name;
	}

	public void setDest_name(String dest_name) {
		this.dest_name = dest_name;
	}

	public String getDest_url() {
		return dest_url;
	}

	public void setDest_url(String dest_url) {
		this.dest_url = dest_url;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

}
