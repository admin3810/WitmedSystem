package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.AllergicSymptoms;
import cn.zs.witmed.service.AllergicSymptomsService;
import cn.zs.witmed.transport.system.AllergicSymptomsTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("allergicSymptomsTransportImpl")
@RequestMapping("/system/trans")
public class AllergicSymptomsTransportImpl implements AllergicSymptomsTransport {
	@Autowired
	private AllergicSymptomsService service;

	@PostMapping("/page")
	public PageVO<AllergicSymptoms> getPageByQuery(@RequestBody QueryVO<AllergicSymptoms> queryVO) throws Exception {
		System.out.println("impl");
		AllergicSymptoms query = queryVO.getQuery();
		PageVO<AllergicSymptoms> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<AllergicSymptoms> getListByQuery(@RequestBody AllergicSymptoms query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody AllergicSymptoms query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody AllergicSymptoms query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public AllergicSymptoms getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public AllergicSymptoms getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
