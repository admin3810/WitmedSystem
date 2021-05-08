package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.MaritalStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaritalStatusDao {
	List<MaritalStatus> findListByQuery (MaritalStatus query) throws Exception;
	int save(MaritalStatus query) throws Exception;
	int update(MaritalStatus query) throws Exception;

}
