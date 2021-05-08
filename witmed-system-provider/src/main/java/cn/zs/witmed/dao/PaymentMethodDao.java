package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.PaymentMethod;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentMethodDao {
	List<PaymentMethod> findListByQuery (PaymentMethod query) throws Exception;
	int save(PaymentMethod query) throws Exception;
	int update(PaymentMethod query) throws Exception;

}
