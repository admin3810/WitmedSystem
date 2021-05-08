package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.AddressType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressTypeDao {
	List<AddressType> findListByQuery (AddressType query) throws Exception;
	int save(AddressType query) throws Exception;
	int update(AddressType query) throws Exception;

}
