package cn.zs.witmed.base.pojo.enums;

public enum StatusEnum {
	STATUS_ENABLE(EnumConstants.STATUS_ENABLE,"启用"),
	STATUS_DISABLE(EnumConstants.STATUS_DISABLE,"禁用");

	private String code;
	private String remark;

	StatusEnum(String code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
