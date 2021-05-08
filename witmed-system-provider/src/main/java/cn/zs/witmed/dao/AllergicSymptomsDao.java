package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.AllergicSymptoms;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllergicSymptomsDao {
	List<AllergicSymptoms> findListByQuery (AllergicSymptoms query) throws Exception;
	int save(AllergicSymptoms query) throws Exception;
	int update(AllergicSymptoms query) throws Exception;

}
