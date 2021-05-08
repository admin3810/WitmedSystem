package cn.zs.witmed.service;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.pojo.system.entity.IdType;

import java.util.List;

/**
 * <b>智慧医疗service接口</b>
 * @author Zs
 * @version 1.0.0
 */

public interface IdTypeService {
	/**
	 * <b>分页查询</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	PageVO<IdType> getPageByQuery(IdType query,PageVO<IdType> pageVO)throws Exception;

	/**
	 * <b>全查</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<IdType> getListByQuery(IdType query)throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	boolean save(IdType query)throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	boolean update(IdType query)throws Exception;

	/**
	 * <b>根据Id查对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	IdType getById(String id)throws Exception;

	/**
	 * <b>根据Code查对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	IdType getByCode(String code)throws Exception;
}
