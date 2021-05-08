package cn.zs.witmed.service;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.pojo.system.entity.NameIdentification;

import java.util.List;

/**
 * <b>智慧医疗service接口</b>
 * @author Zs
 * @version 1.0.0
 */

public interface NameIdentificationService {
	/**
	 * <b>分页查询</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	PageVO<NameIdentification> getPageByQuery(NameIdentification query, PageVO<NameIdentification> pageVO)throws Exception;

	/**
	 * <b>全查</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<NameIdentification> getListByQuery(NameIdentification query)throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	boolean save(NameIdentification query)throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	boolean update(NameIdentification query)throws Exception;

	/**
	 * <b>根据Id查对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	NameIdentification getById(String id)throws Exception;

	/**
	 * <b>根据Code查对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	NameIdentification getByCode(String code)throws Exception;
}