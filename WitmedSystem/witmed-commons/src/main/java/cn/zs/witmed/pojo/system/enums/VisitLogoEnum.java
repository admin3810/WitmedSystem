package cn.zs.witmed.pojo.system.enums;
/**
 * <b>初诊标识枚举类</b>
 * @author zs
 * @version 1.0.0
 */
public enum VisitLogoEnum {
	FIRST_VISIT(SystemEnumConstants.SYSTEM_FIRST_VISIT,"初诊"),
	FOLLOW_UP(SystemEnumConstants.SYSTEM_FOLLOW_UP,"复诊");
	private String code;
	private String remark;
	VisitLogoEnum(String code,String remark){
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
