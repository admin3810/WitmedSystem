package cn.zs.witmed.util;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;

	/**
	 * <b>给定对象存储到Redis中</b>
	 * @param key
	 * @param obj
	 * @param expireMillis
	 * @throws Exception
	 */
	public void saveToRedis(String key,Object obj,Long expireMillis)throws  Exception{
		JsonMapper jsonMapper = new JsonMapper();
		String jsonStr = jsonMapper.writeValueAsString(obj).replace("\"","'");
		redisTemplate.opsForValue().set(key,jsonStr);
		if (expireMillis != null && expireMillis > 0){
			redisTemplate.expire(key,expireMillis, TimeUnit.MILLISECONDS);

		}else{
			redisTemplate.expire(key,Constants.REDIS_EXPIRE_MILLIS,TimeUnit.MILLISECONDS);

		}
	}

	/**
	 * <b>根据key从Redis中取值</b>
	 * @param key
	 * @param objType
	 * @return
	 * @throws Exception
	 */
	public Object findFromRedis(String key,Class objType) throws  Exception{
		String jsonStr =redisTemplate.opsForValue().get(key);
		if (jsonStr !=null){
			JsonMapper jsonMapper = new JsonMapper();
			return jsonMapper.readValue(jsonStr,objType);

		}
		return null;
	}
}
