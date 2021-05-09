package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.DrugUse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugUseDao {
	List<DrugUse> findListByQuery (DrugUse query) throws Exception;
	int save(DrugUse query) throws Exception;
	int update(DrugUse query) throws Exception;

}
