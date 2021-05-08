package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.NameIdentification;
import cn.zs.witmed.service.NameIdentificationService;
import cn.zs.witmed.transport.system.NameIdentificationTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("nameIdentificationTransportImpl")
@RequestMapping("/system/trans")
public class NameIdentificationTransportImpl implements NameIdentificationTransport {
	@Autowired
	private NameIdentificationService service;

	@PostMapping("/page")
	public PageVO<NameIdentification> getPageByQuery(@RequestBody QueryVO<NameIdentification> queryVO) throws Exception {
		System.out.println("impl");
		NameIdentification query = queryVO.getQuery();
		PageVO<NameIdentification> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<NameIdentification> getListByQuery(@RequestBody NameIdentification query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody NameIdentification query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody NameIdentification query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public NameIdentification getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public NameIdentification getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
