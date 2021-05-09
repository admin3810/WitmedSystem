package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.Allergies;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllergiesDao {
	List<Allergies> findListByQuery (Allergies query) throws Exception;
	int save(Allergies query) throws Exception;
	int update(Allergies query) throws Exception;

}
