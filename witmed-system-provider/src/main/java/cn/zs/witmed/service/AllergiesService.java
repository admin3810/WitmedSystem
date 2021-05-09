package cn.zs.witmed.service;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.pojo.system.entity.Allergies;

import java.util.List;

/**
 * <b>智慧医疗service接口</b>
 * @author Zs
 * @version 1.0.0
 */

public interface AllergiesService {
	/**
	 * <b>分页查询</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	PageVO<Allergies> getPageByQuery(Allergies query, PageVO<Allergies> pageVO)throws Exception;

	/**
	 * <b>全查</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Allergies> getListByQuery(Allergies query)throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	boolean save(Allergies query)throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	boolean update(Allergies query)throws Exception;

	/**
	 * <b>根据Id查对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Allergies getById(String id)throws Exception;

	/**
	 * <b>根据Code查对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	Allergies getByCode(String code)throws Exception;
}
