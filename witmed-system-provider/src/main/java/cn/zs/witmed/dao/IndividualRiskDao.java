package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.IndividualRisk;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndividualRiskDao {
	List<IndividualRisk> findListByQuery (IndividualRisk query) throws Exception;
	int save(IndividualRisk query) throws Exception;
	int update(IndividualRisk query) throws Exception;

}
