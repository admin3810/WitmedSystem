package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.Nationality;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NationalityDao {
	List<Nationality> findListByQuery (Nationality query) throws Exception;
	int save(Nationality query) throws Exception;
	int update(Nationality query) throws Exception;

}
