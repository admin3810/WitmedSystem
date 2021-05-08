package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.ObservationMethod;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObservationMethodDao {
	List<ObservationMethod> findListByQuery (ObservationMethod query) throws Exception;
	int save(ObservationMethod query) throws Exception;
	int update(ObservationMethod query) throws Exception;

}
