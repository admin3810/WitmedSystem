package cn.zs.witmed.pojo.system.enums;

import java.util.Properties;

public class SystemEnumConstants {
	private  static Properties prop;
	static {
		try {
			prop.load(SystemEnumConstants.class.getClassLoader().getResourceAsStream("props/system.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * <b>严重程度：低</b>
	 */
	static final String SYSTEM_SEVERITY_LIGHT=prop.getProperty("system.severity.light");
	/**
	 * <b>严重程度：中</b>
	 */
	static final String SYSTEM_SEVERITY_MEDIUM=prop.getProperty("system.severity.medium");
	/**
	 * <b>严重程度：高</b>
	 */
	static final String SYSTEM_SEVERITY_WEIGHT=prop.getProperty("system.severity.weight");
	/**
	 * <b>是否过敏：否</b>
	 */
	static final String SYSTEM_ALLERGIC_NO=prop.getProperty("system.allergic.no");
	/**
	 * <b>是否过敏：是</b>
	 */
	static final String SYSTEM_ALLERGIC_HAVE=prop.getProperty("system.allergic.have");
	/**
	 * <b>是否过敏：未说明</b>
	 */
	static final String SYSTEM_ALLERGIC_NOT_STATED=prop.getProperty("system.allergic.not.stated");
	/**
	 * <b>RH血型:阳性</b>
	 */
	static final String SYSTEM_RH_POSITIVE=prop.getProperty("system.rh.positive");
	/**
	 * <b>RH血型:阴性</b>
	 */
	static final String SYSTEM_RH_NEGATIVE=prop.getProperty("system.rh.negative");
	/**
	 * <b>RH血型:不详</b>
	 */
	static final String SYSTEM_RH_UNKNOWN=prop.getProperty("system.rh.unknown");
	/**
	 * <b>初诊标识:初诊</b>
	 */
	static final String SYSTEM_FIRST_VISIT=prop.getProperty("system.first.visit");
	/**
	 * <b>初诊标识:复诊</b>
	 */
	static final String SYSTEM_FOLLOW_UP=prop.getProperty("system.follow.up");
}
