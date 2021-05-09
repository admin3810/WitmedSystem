package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.PastObservations;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PastObservationsDao {
	List<PastObservations> findListByQuery (PastObservations query) throws Exception;
	int save(PastObservations query) throws Exception;
	int update(PastObservations query) throws Exception;

}
