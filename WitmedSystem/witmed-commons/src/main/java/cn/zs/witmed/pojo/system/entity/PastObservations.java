package cn.zs.witmed.pojo.system.entity;

import cn.zs.witmed.base.pojo.entity.BaseEntity;

public class PastObservations extends BaseEntity {
	private String id;
	private String text;
	private String code;
	private String explain;

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
