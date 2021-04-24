package cn.zs.witmed.util;

import java.util.Properties;

/**
 * <b>智慧医疗-系统常量工具类</b>
 * @author Arthur
 * @version 1.0.0
 */
public class Constants {
	private static Properties props = new Properties();

	static {
		try {
			// 加载配置文件 enums.properties
			props.load(Constants.class.getClassLoader().getResourceAsStream("props/witmed.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>分页信息：当前页码</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));

	/**
	 * <b>分页信息：每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));

	/**
	 * <b>Token 秘钥</b>
	 */
	public static final String TOKEN_SECRET_KEY = props.getProperty("token.secret.key");

	/**
	 * <b>Token 过期时间</b>
	 */
	public static final Long TOKEN_EXPIRE_MILLIS = Long.parseLong(props.getProperty("token.expire.millis"));

	/**
	 * <b>Redis 过期时间</b>
	 */
	public static final Long REDIS_EXPIRE_MILLIS = Long.parseLong(props.getProperty("redis.expire.millis"));
}
