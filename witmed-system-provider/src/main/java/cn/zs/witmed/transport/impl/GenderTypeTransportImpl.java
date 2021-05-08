package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.GenderType;
import cn.zs.witmed.service.GenderTypeService;
import cn.zs.witmed.transport.system.GenderTypeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("genderTypeTransportImpl")
@RequestMapping("/system/trans")
public class GenderTypeTransportImpl implements GenderTypeTransport {
	@Autowired
	private GenderTypeService service;

	@PostMapping("/page")
	public PageVO<GenderType> getPageByQuery(@RequestBody QueryVO<GenderType> queryVO) throws Exception {
		System.out.println("impl");
		GenderType query = queryVO.getQuery();
		PageVO<GenderType> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<GenderType> getListByQuery(@RequestBody GenderType query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody GenderType query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody GenderType query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public GenderType getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public GenderType getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
