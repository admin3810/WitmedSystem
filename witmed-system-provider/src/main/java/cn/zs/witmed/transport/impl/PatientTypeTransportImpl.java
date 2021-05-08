package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.PatientType;
import cn.zs.witmed.service.PatientTypeService;
import cn.zs.witmed.transport.system.PatientTypeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("patientTypeTransportImpl")
@RequestMapping("/system/trans")
public class PatientTypeTransportImpl implements PatientTypeTransport {
	@Autowired
	private PatientTypeService service;

	@PostMapping("/page")
	public PageVO<PatientType> getPageByQuery(@RequestBody QueryVO<PatientType> queryVO) throws Exception {
		System.out.println("impl");
		PatientType query = queryVO.getQuery();
		PageVO<PatientType> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<PatientType> getListByQuery(@RequestBody PatientType query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody PatientType query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody PatientType query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public PatientType getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public PatientType getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
