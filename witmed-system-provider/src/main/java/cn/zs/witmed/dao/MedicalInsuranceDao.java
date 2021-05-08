package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.MedicalInsurance;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalInsuranceDao {
	List<MedicalInsurance> findListByQuery (MedicalInsurance query) throws Exception;
	int save(MedicalInsurance query) throws Exception;
	int update(MedicalInsurance query) throws Exception;

}
