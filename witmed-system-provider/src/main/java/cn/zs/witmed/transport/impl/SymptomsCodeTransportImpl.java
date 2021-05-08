package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.SymptomsCode;
import cn.zs.witmed.service.SymptomsCodeService;
import cn.zs.witmed.transport.system.SymptomsCodeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("symptomsCodeTransportImpl")
@RequestMapping("/system/trans")
public class SymptomsCodeTransportImpl implements SymptomsCodeTransport {
	@Autowired
	private SymptomsCodeService service;

	@PostMapping("/page")
	public PageVO<SymptomsCode> getPageByQuery(@RequestBody QueryVO<SymptomsCode> queryVO) throws Exception {
		System.out.println("impl");
		SymptomsCode query = queryVO.getQuery();
		PageVO<SymptomsCode> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<SymptomsCode> getListByQuery(@RequestBody SymptomsCode query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody SymptomsCode query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody SymptomsCode query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public SymptomsCode getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public SymptomsCode getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
