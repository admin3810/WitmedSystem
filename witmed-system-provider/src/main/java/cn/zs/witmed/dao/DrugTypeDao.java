package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.DrugType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugTypeDao {
	List<DrugType> findListByQuery (DrugType query) throws Exception;
	int save(DrugType query) throws Exception;
	int update(DrugType query) throws Exception;

}
