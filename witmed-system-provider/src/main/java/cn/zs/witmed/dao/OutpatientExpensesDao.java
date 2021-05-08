package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.OutpatientExpenses;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OutpatientExpensesDao {
	List<OutpatientExpenses> findListByQuery (OutpatientExpenses query) throws Exception;
	int save(OutpatientExpenses query) throws Exception;
	int update(OutpatientExpenses query) throws Exception;

}
