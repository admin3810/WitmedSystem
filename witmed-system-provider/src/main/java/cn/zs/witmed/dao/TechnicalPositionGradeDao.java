package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.TechnicalPositionGrade;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnicalPositionGradeDao {
	List<TechnicalPositionGrade> findListByQuery (TechnicalPositionGrade query) throws Exception;
	int save(TechnicalPositionGrade query) throws Exception;
	int update(TechnicalPositionGrade query) throws Exception;

}
