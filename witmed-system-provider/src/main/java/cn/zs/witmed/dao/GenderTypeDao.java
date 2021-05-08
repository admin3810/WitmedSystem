package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.GenderType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenderTypeDao {
	List<GenderType> findListByQuery (GenderType query) throws Exception;
	int save(GenderType query) throws Exception;
	int update(GenderType query) throws Exception;

}
