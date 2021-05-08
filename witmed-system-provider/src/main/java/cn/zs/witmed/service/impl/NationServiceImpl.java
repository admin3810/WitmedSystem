package cn.zs.witmed.service.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.dao.NationDao;
import cn.zs.witmed.pojo.system.entity.Nation;
import cn.zs.witmed.service.NationService;
import cn.zs.witmed.util.IdGenerator;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>智慧医疗service实现类</b>
 * @author Zs
 * @version 1.0.0
 */
@Service("nationService")
@Transactional
public class NationServiceImpl implements NationService {
	@Autowired
	private NationDao dao;
	@Autowired
	private IdGenerator idGenerator;
	/**
	 * <b>分页查询</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */

	public PageVO<Nation> getPageByQuery(Nation query, PageVO<Nation> pageVO) throws Exception {
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		List<Nation> list =dao.findListByQuery(query);
		System.out.println(list+"000");
		PageInfo<Nation> pageInfo=new PageInfo<Nation>(list);
		pageVO.setList(pageInfo.getList());
		pageVO.setTotalCount(pageInfo.getTotal());
		pageVO.setTotalSize((long) pageInfo.getPages());
		return pageVO;
	}
	/**
	 * <b>全查</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Nation> getListByQuery(Nation query) throws Exception {
		return dao.findListByQuery(query);
	}
	/**
	 * <b>保存对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(Nation query) throws Exception {
		query.setId(idGenerator.createId());
		if (dao.save(query)>0){
			return true;
		}
		return false;
	}
	/**
	 * <b>修改对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(Nation query) throws Exception {
		if (dao.update(query)>0){
			return true;
		}
		return false;
	}
	/**
	 * <b>根据Id查对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public Nation getById(String id) throws Exception {
		Nation query = new Nation();
		query.setId(id);
		List<Nation> list = dao.findListByQuery(query);
		if (list!=null&&list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
	/**
	 * <b>根据Code查对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@Override
	public Nation getByCode(String code) throws Exception {
		Nation query = new Nation();
		query.setId(code);
		List<Nation> list = dao.findListByQuery(query);
		if (list!=null&&list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
}
