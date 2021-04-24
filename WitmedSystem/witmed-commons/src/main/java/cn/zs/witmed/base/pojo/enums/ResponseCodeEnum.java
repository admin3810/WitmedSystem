package cn.zs.witmed.base.pojo.enums;

/**
 * <b>智慧医疗-系统响应码枚举信息</b>
 * @author Arthur
 * @version 1.0.0
 */
public enum ResponseCodeEnum {
	RESPONSE_CODE_SUCCESS(EnumConstants.RESPONSE_SUCCESS, "系统响应成功"),
	RESPONSE_CODE_ERROR(EnumConstants.RESPONSE_ERROR, "系统业务处理错误"),
	RESPONSE_CODE_UNAUTHC(EnumConstants.RESPONSE_UNAUTHC, "用户未认证"),
	RESPONSE_CODE_EXCEPTION(EnumConstants.RESPONSE_EXCEPTION, "系统响应异常");

	private Integer code;                        // 编码
	private String remark;                      // 说明

	private ResponseCodeEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
