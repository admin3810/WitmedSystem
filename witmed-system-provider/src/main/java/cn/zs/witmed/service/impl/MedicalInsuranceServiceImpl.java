package cn.zs.witmed.service.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.dao.MedicalInsuranceDao;
import cn.zs.witmed.pojo.system.entity.MedicalInsurance;
import cn.zs.witmed.service.MedicalInsuranceService;
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
@Service("medicalInsuranceService")
@Transactional
public class MedicalInsuranceServiceImpl implements MedicalInsuranceService {
	@Autowired
	private MedicalInsuranceDao dao;
	@Autowired
	private IdGenerator idGenerator;
	/**
	 * <b>分页查询</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */

	public PageVO<MedicalInsurance> getPageByQuery(MedicalInsurance query, PageVO<MedicalInsurance> pageVO) throws Exception {
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		List<MedicalInsurance> list =dao.findListByQuery(query);
		System.out.println(list+"000");
		PageInfo<MedicalInsurance> pageInfo=new PageInfo<MedicalInsurance>(list);
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
	public List<MedicalInsurance> getListByQuery(MedicalInsurance query) throws Exception {
		return dao.findListByQuery(query);
	}
	/**
	 * <b>保存对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(MedicalInsurance query) throws Exception {
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
	public boolean update(MedicalInsurance query) throws Exception {
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
	public MedicalInsurance getById(String id) throws Exception {
		MedicalInsurance query = new MedicalInsurance();
		query.setId(id);
		List<MedicalInsurance> list = dao.findListByQuery(query);
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
	public MedicalInsurance getByCode(String code) throws Exception {
		MedicalInsurance query = new MedicalInsurance();
		query.setId(code);
		List<MedicalInsurance> list = dao.findListByQuery(query);
		if (list!=null&&list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
}
