package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.ProfessionType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessionTypeDao {
	List<ProfessionType> findListByQuery (ProfessionType query) throws Exception;
	int save(ProfessionType query) throws Exception;
	int update(ProfessionType query) throws Exception;

}
