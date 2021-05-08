package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.IdType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdTypeDao {
	List<IdType> findListByQuery (IdType query) throws Exception;
	int save(IdType query) throws Exception;
	int update(IdType query) throws Exception;

}
