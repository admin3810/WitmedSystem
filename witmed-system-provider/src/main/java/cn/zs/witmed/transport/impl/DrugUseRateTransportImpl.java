package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.DrugUseRate;
import cn.zs.witmed.service.DrugUseRateService;
import cn.zs.witmed.transport.system.DrugUseRateTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("drugUseRateTransportImpl")
@RequestMapping("/system/trans")
public class DrugUseRateTransportImpl implements DrugUseRateTransport {
	@Autowired
	private DrugUseRateService service;

	@PostMapping("/page")
	public PageVO<DrugUseRate> getPageByQuery(@RequestBody QueryVO<DrugUseRate> queryVO) throws Exception {
		System.out.println("impl");
		DrugUseRate query = queryVO.getQuery();
		PageVO<DrugUseRate> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<DrugUseRate> getListByQuery(@RequestBody DrugUseRate query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody DrugUseRate query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody DrugUseRate query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public DrugUseRate getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public DrugUseRate getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
