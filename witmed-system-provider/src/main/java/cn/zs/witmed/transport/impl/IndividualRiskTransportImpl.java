package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.IndividualRisk;
import cn.zs.witmed.service.IndividualRiskService;
import cn.zs.witmed.transport.system.IndividualRiskTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("individualRiskTransportImpl")
@RequestMapping("/system/trans")
public class IndividualRiskTransportImpl implements IndividualRiskTransport {
	@Autowired
	private IndividualRiskService service;

	@PostMapping("/page")
	public PageVO<IndividualRisk> getPageByQuery(@RequestBody QueryVO<IndividualRisk> queryVO) throws Exception {
		System.out.println("impl");
		IndividualRisk query = queryVO.getQuery();
		PageVO<IndividualRisk> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<IndividualRisk> getListByQuery(@RequestBody IndividualRisk query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody IndividualRisk query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody IndividualRisk query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public IndividualRisk getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public IndividualRisk getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
