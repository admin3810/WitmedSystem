package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.SymptomsCode;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SymptomsCodeDao {
	List<SymptomsCode> findListByQuery (SymptomsCode query) throws Exception;
	int save(SymptomsCode query) throws Exception;
	int update(SymptomsCode query) throws Exception;

}
