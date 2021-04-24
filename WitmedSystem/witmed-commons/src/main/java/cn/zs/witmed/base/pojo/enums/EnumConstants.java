package cn.zs.witmed.base.pojo.enums;

import java.util.Properties;

public class EnumConstants {
	private static Properties props = new Properties();
	static {
		try {
			props.load(EnumConstants.class.getClassLoader().getResourceAsStream("props/enums.properties"));
		}catch ( Exception e){
			e.printStackTrace();
		}
	}
	static final String STATUS_ENABLE =props.getProperty("enum.status.enable");
	static final String STATUS_DISABLE =props.getProperty("enum.status.disable");
	/**
	 * <b>系统响应状态码：系统响应成功</b>
	 */
	static final Integer RESPONSE_SUCCESS = Integer.parseInt(props.getProperty("enum.response.success"));

	/**
	 * <b>系统响应状态码：系统处理业务错误</b>
	 */
	static final Integer RESPONSE_ERROR = Integer.parseInt(props.getProperty("enum.response.error"));

	/**
	 * <b>系统响应状态码：用户未认证</b>
	 */
	static final Integer RESPONSE_UNAUTHC = Integer.parseInt(props.getProperty("enum.response.unauhtc"));

	/**
	 * <b>系统响应状态码：系统处理异常</b>
	 */
	static final Integer RESPONSE_EXCEPTION = Integer.parseInt(props.getProperty("enum.response.exception"));
}
