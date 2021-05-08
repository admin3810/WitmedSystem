package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.EducationType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationTypeDao {
	List<EducationType> findListByQuery (EducationType query) throws Exception;
	int save(EducationType query) throws Exception;
	int update(EducationType query) throws Exception;

}
