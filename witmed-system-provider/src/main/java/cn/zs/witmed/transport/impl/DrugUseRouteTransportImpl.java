package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.DrugUseRoute;
import cn.zs.witmed.service.DrugUseRouteService;
import cn.zs.witmed.transport.system.DrugUseRouteTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("drugUseRouteTransportImpl")
@RequestMapping("/system/trans")
public class DrugUseRouteTransportImpl implements DrugUseRouteTransport {
	@Autowired
	private DrugUseRouteService service;

	@PostMapping("/page")
	public PageVO<DrugUseRoute> getPageByQuery(@RequestBody QueryVO<DrugUseRoute> queryVO) throws Exception {
		System.out.println("impl");
		DrugUseRoute query = queryVO.getQuery();
		PageVO<DrugUseRoute> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<DrugUseRoute> getListByQuery(@RequestBody DrugUseRoute query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody DrugUseRoute query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody DrugUseRoute query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public DrugUseRoute getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public DrugUseRoute getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
