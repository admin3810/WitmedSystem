package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.TelephoneType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelephoneTypeDao {
	List<TelephoneType> findListByQuery (TelephoneType query) throws Exception;
	int save(TelephoneType query) throws Exception;
	int update(TelephoneType query) throws Exception;

}
