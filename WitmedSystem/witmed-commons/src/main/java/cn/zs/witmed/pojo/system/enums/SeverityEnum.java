package cn.zs.witmed.pojo.system.enums;

/**
 * <b>严重程度枚举类</b>
 * @author zs
 * @version 1.0.0
 */
public enum SeverityEnum {
	SEVERITY_LIGHT(SystemEnumConstants.SYSTEM_SEVERITY_LIGHT,"低"),
	SEVERITY_MEDIUM(SystemEnumConstants.SYSTEM_SEVERITY_MEDIUM,"中"),
	SEVERITY_WEIGHT(SystemEnumConstants.SYSTEM_SEVERITY_WEIGHT,"高");
	private String code;
	private String remark;
	SeverityEnum(String code,String remark){
		this.code=code;
		this.remark=remark;
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
