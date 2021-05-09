package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.Allergies;
import cn.zs.witmed.service.AllergiesService;
import cn.zs.witmed.transport.system.AllergiesTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("allergiesTransportImpl")
@RequestMapping("/system/trans")
public class AllergiesTransportImpl implements AllergiesTransport {
	@Autowired
	private AllergiesService service;

	@PostMapping("/page")
	public PageVO<Allergies> getPageByQuery(@RequestBody QueryVO<Allergies> queryVO) throws Exception {
		System.out.println("impl");
		Allergies query = queryVO.getQuery();
		PageVO<Allergies> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<Allergies> getListByQuery(@RequestBody Allergies query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody Allergies query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody Allergies query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public Allergies getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public Allergies getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
