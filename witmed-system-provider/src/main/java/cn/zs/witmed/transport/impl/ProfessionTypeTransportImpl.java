package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.ProfessionType;
import cn.zs.witmed.service.ProfessionTypeService;
import cn.zs.witmed.transport.system.ProfessionTypeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("professionTypeTransportImpl")
@RequestMapping("/system/trans")
public class ProfessionTypeTransportImpl implements ProfessionTypeTransport {
	@Autowired
	private ProfessionTypeService service;

	@PostMapping("/page")
	public PageVO<ProfessionType> getPageByQuery(@RequestBody QueryVO<ProfessionType> queryVO) throws Exception {
		System.out.println("impl");
		ProfessionType query = queryVO.getQuery();
		PageVO<ProfessionType> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<ProfessionType> getListByQuery(@RequestBody ProfessionType query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody ProfessionType query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody ProfessionType query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public ProfessionType getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public ProfessionType getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
