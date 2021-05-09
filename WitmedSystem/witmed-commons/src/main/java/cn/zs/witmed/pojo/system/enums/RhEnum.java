package cn.zs.witmed.pojo.system.enums;
/**
 * <b>RH血型枚举类</b>
 * @author zs
 * @version 1.0.0
 */
public enum RhEnum {
	RH_POSITIVE(SystemEnumConstants.SYSTEM_RH_POSITIVE,"阳性"),
	RH_NEGATIVE(SystemEnumConstants.SYSTEM_RH_NEGATIVE,"阴性"),
	RH_UNKNOWN(SystemEnumConstants.SYSTEM_RH_UNKNOWN,"不详");
	private String code;
	private String remark;
	RhEnum(String code,String remark){
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
