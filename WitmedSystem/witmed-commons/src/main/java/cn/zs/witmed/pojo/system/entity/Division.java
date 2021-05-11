package cn.zs.witmed.pojo.system.entity;

import cn.zs.witmed.base.pojo.entity.BaseEntity;

import java.util.List;

public class Division extends BaseEntity {

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Division getParentCode() {
		return parentCode;
	}

	public void setParentCode(Division parentCode) {
		this.parentCode = parentCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Division> getChildren() {
		return children;
	}

	public void setChildren(List<Division> children) {
		this.children = children;
	}

	private String id;
	private Division parentCode;
	private String code;
	private String name;
	private List<Division> children;

}
