package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.TechnicalPosition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnicalPositionDao {
	List<TechnicalPosition> findListByQuery (TechnicalPosition query) throws Exception;
	int save(TechnicalPosition query) throws Exception;
	int update(TechnicalPosition query) throws Exception;

}
