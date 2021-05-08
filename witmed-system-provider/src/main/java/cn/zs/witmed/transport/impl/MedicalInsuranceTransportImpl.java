package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.MedicalInsurance;
import cn.zs.witmed.service.MedicalInsuranceService;
import cn.zs.witmed.transport.system.MedicalInsuranceTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("medicalInsuranceTransportImpl")
@RequestMapping("/system/trans")
public class MedicalInsuranceTransportImpl implements MedicalInsuranceTransport {
	@Autowired
	private MedicalInsuranceService service;

	@PostMapping("/page")
	public PageVO<MedicalInsurance> getPageByQuery(@RequestBody QueryVO<MedicalInsurance> queryVO) throws Exception {
		System.out.println("impl");
		MedicalInsurance query = queryVO.getQuery();
		PageVO<MedicalInsurance> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<MedicalInsurance> getListByQuery(@RequestBody MedicalInsurance query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody MedicalInsurance query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody MedicalInsurance query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public MedicalInsurance getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public MedicalInsurance getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
