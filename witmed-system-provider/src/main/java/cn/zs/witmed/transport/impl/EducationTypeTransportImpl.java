package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.EducationType;
import cn.zs.witmed.service.EducationTypeService;
import cn.zs.witmed.transport.system.EducationTypeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("educationTypeTransportImpl")
@RequestMapping("/system/trans")
public class EducationTypeTransportImpl implements EducationTypeTransport {
	@Autowired
	private EducationTypeService service;

	@PostMapping("/page")
	public PageVO<EducationType> getPageByQuery(@RequestBody QueryVO<EducationType> queryVO) throws Exception {
		System.out.println("impl");
		EducationType query = queryVO.getQuery();
		PageVO<EducationType> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<EducationType> getListByQuery(@RequestBody EducationType query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody EducationType query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody EducationType query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public EducationType getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public EducationType getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
