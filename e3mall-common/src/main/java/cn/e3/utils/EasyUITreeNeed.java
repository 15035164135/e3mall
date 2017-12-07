package cn.e3.utils;

import java.io.Serializable;

/**
 * easyui:
 * 	按需查询:
 * 		所需要的字段为id  text state
 * @author 77054
 *
 */
public class EasyUITreeNeed implements Serializable{
	private Integer id;
	private String text;
	private String state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
