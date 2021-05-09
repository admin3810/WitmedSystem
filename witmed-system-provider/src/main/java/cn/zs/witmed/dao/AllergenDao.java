package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.Allergen;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllergenDao {
	List<Allergen> findListByQuery (Allergen query) throws Exception;
	int save(Allergen query) throws Exception;
	int update(Allergen query) throws Exception;

}
