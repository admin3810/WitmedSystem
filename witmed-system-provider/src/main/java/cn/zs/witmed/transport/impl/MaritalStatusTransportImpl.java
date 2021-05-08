package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.MaritalStatus;
import cn.zs.witmed.service.MaritalStatusService;
import cn.zs.witmed.transport.system.MaritalStatusTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("maritalStatusTransportImpl")
@RequestMapping("/system/trans")
public class MaritalStatusTransportImpl implements MaritalStatusTransport {
	@Autowired
	private MaritalStatusService service;

	@PostMapping("/page")
	public PageVO<MaritalStatus> getPageByQuery(@RequestBody QueryVO<MaritalStatus> queryVO) throws Exception {
		System.out.println("impl");
		MaritalStatus query = queryVO.getQuery();
		PageVO<MaritalStatus> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<MaritalStatus> getListByQuery(@RequestBody MaritalStatus query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody MaritalStatus query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody MaritalStatus query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public MaritalStatus getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public MaritalStatus getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
