package cn.zs.witmed.pojo.system.enums;
/**
 * <b>是否过敏枚举类</b>
 * @author zs
 * @version 1.0.0
 */
public enum AllergicEnum {
	ALLERGIC_NO(SystemEnumConstants.SYSTEM_ALLERGIC_NO,"无"),
	ALLERGIC_HAVE(SystemEnumConstants.SYSTEM_ALLERGIC_HAVE,"有"),
	ALLERGIC_NOT_STATED(SystemEnumConstants.SYSTEM_ALLERGIC_NOT_STATED,"未说明");
	private String code;
	private String remark;
	AllergicEnum(String code,String remark){
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
