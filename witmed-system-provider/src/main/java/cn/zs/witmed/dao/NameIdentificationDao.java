package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.NameIdentification;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NameIdentificationDao {
	List<NameIdentification> findListByQuery (NameIdentification query) throws Exception;
	int save(NameIdentification query) throws Exception;
	int update(NameIdentification query) throws Exception;

}
