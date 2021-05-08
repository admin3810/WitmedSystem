package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.PatientType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientTypeDao {
	List<PatientType> findListByQuery (PatientType query) throws Exception;
	int save(PatientType query) throws Exception;
	int update(PatientType query) throws Exception;

}
