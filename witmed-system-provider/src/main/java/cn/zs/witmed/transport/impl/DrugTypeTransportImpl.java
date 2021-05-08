package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.DrugType;
import cn.zs.witmed.service.DrugTypeService;
import cn.zs.witmed.transport.system.DrugTypeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("drugTypeTransportImpl")
@RequestMapping("/system/trans")
public class DrugTypeTransportImpl implements DrugTypeTransport {
	@Autowired
	private DrugTypeService service;

	@PostMapping("/page")
	public PageVO<DrugType> getPageByQuery(@RequestBody QueryVO<DrugType> queryVO) throws Exception {
		System.out.println("impl");
		DrugType query = queryVO.getQuery();
		PageVO<DrugType> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<DrugType> getListByQuery(@RequestBody DrugType query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody DrugType query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody DrugType query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public DrugType getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public DrugType getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
