package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.DrugUseRate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugUseRateDao {
	List<DrugUseRate> findListByQuery (DrugUseRate query) throws Exception;
	int save(DrugUseRate query) throws Exception;
	int update(DrugUseRate query) throws Exception;

}
