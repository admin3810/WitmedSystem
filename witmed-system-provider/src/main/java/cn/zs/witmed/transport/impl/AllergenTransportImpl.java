package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.Allergen;
import cn.zs.witmed.service.AllergenService;
import cn.zs.witmed.transport.system.AllergenTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("allergenTransportImpl")
@RequestMapping("/system/trans")
public class AllergenTransportImpl implements AllergenTransport {
	@Autowired
	private AllergenService service;

	@PostMapping("/page")
	public PageVO<Allergen> getPageByQuery(@RequestBody QueryVO<Allergen> queryVO) throws Exception {
		System.out.println("impl");
		Allergen query = queryVO.getQuery();
		PageVO<Allergen> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<Allergen> getListByQuery(@RequestBody Allergen query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody Allergen query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody Allergen query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public Allergen getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public Allergen getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
