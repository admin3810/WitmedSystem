package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.ABOBlood;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ABOBloodDao {
	List<ABOBlood> findListByQuery (ABOBlood query) throws Exception;
	int save(ABOBlood query) throws Exception;
	int update(ABOBlood query) throws Exception;

}
