package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.Nation;
import cn.zs.witmed.service.NationService;
import cn.zs.witmed.transport.system.NationTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("nationTransportImpl")
@RequestMapping("/system/trans")
public class NationTransportImpl implements NationTransport {
	@Autowired
	private NationService service;

	@PostMapping("/page")
	public PageVO<Nation> getPageByQuery(@RequestBody QueryVO<Nation> queryVO) throws Exception {
		System.out.println("impl");
		Nation query = queryVO.getQuery();
		PageVO<Nation> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<Nation> getListByQuery(@RequestBody Nation query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody Nation query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody Nation query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public Nation getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public Nation getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
