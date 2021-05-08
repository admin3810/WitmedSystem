package cn.zs.witmed.service.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.dao.ProfessionTypeDao;
import cn.zs.witmed.pojo.system.entity.ProfessionType;
import cn.zs.witmed.service.ProfessionTypeService;
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
@Service("professionTypeService")
@Transactional
public class ProfessionTypeServiceImpl implements ProfessionTypeService {
	@Autowired
	private ProfessionTypeDao dao;
	@Autowired
	private IdGenerator idGenerator;
	/**
	 * <b>分页查询</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */

	public PageVO<ProfessionType> getPageByQuery(ProfessionType query, PageVO<ProfessionType> pageVO) throws Exception {
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		List<ProfessionType> list =dao.findListByQuery(query);
		System.out.println(list+"000");
		PageInfo<ProfessionType> pageInfo=new PageInfo<ProfessionType>(list);
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
	public List<ProfessionType> getListByQuery(ProfessionType query) throws Exception {
		return dao.findListByQuery(query);
	}
	/**
	 * <b>保存对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(ProfessionType query) throws Exception {
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
	public boolean update(ProfessionType query) throws Exception {
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
	public ProfessionType getById(String id) throws Exception {
		ProfessionType query = new ProfessionType();
		query.setId(id);
		List<ProfessionType> list = dao.findListByQuery(query);
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
	public ProfessionType getByCode(String code) throws Exception {
		ProfessionType query = new ProfessionType();
		query.setId(code);
		List<ProfessionType> list = dao.findListByQuery(query);
		if (list!=null&&list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
}
