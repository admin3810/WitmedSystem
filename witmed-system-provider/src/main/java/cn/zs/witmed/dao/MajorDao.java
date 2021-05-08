package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.Major;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MajorDao {
	List<Major> findListByQuery (Major query) throws Exception;
	int save(Major query) throws Exception;
	int update(Major query) throws Exception;

}
