package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.DrugUseRoute;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugUseRouteDao {
	List<DrugUseRoute> findListByQuery (DrugUseRoute query) throws Exception;
	int save(DrugUseRoute query) throws Exception;
	int update(DrugUseRoute query) throws Exception;

}
