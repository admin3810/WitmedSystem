package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.IdType;
import cn.zs.witmed.service.IdTypeService;
import cn.zs.witmed.transport.system.IdTypeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController("idTypeTransportImpl")
@RequestMapping("/system/trans")
public class IdTypeTransportImpl implements IdTypeTransport {
	@Autowired
	private IdTypeService service;

	@PostMapping("/page")
	public PageVO<IdType> getPageByQuery(@RequestBody QueryVO<IdType> queryVO) throws Exception {
		System.out.println("impl");
		IdType query = queryVO.getQuery();
		PageVO<IdType> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}

	@Override
	@PostMapping("/query")
	public List<IdType> getListByQuery(@RequestBody IdType query) throws Exception {
		return service.getListByQuery(query);
	}

	@Override
	@PostMapping("save")
	public boolean save(@RequestBody IdType query) throws Exception {
		return service.save(query);
	}

	@Override
	@PostMapping("/update")
	public boolean update(@RequestBody IdType query) throws Exception {
		return service.update(query);
	}

	@Override
	@PostMapping("/id")
	public IdType getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public IdType getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
