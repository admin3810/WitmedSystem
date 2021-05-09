package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.DrugUse;
import cn.zs.witmed.service.DrugUseService;
import cn.zs.witmed.transport.system.DrugUseTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("drugUseTransportImpl")
@RequestMapping("/system/trans")
public class DrugUseTransportImpl implements DrugUseTransport {
	@Autowired
	private DrugUseService service;

	@PostMapping("/page")
	public PageVO<DrugUse> getPageByQuery(@RequestBody QueryVO<DrugUse> queryVO) throws Exception {
		System.out.println("impl");
		DrugUse query = queryVO.getQuery();
		PageVO<DrugUse> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<DrugUse> getListByQuery(@RequestBody DrugUse query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody DrugUse query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody DrugUse query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public DrugUse getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public DrugUse getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
