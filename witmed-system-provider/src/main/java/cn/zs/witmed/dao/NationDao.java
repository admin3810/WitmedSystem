package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.Nation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NationDao {
	List<Nation> findListByQuery (Nation query) throws Exception;
	int save(Nation query) throws Exception;
	int update(Nation query) throws Exception;

}
