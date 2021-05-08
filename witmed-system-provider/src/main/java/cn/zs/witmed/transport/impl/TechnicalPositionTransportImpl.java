package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.TechnicalPosition;
import cn.zs.witmed.service.TechnicalPositionService;
import cn.zs.witmed.transport.system.TechnicalPositionTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("technicalPositionTransportImpl")
@RequestMapping("/system/trans")
public class TechnicalPositionTransportImpl implements TechnicalPositionTransport {
	@Autowired
	private TechnicalPositionService service;

	@PostMapping("/page")
	public PageVO<TechnicalPosition> getPageByQuery(@RequestBody QueryVO<TechnicalPosition> queryVO) throws Exception {
		System.out.println("impl");
		TechnicalPosition query = queryVO.getQuery();
		PageVO<TechnicalPosition> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<TechnicalPosition> getListByQuery(@RequestBody TechnicalPosition query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody TechnicalPosition query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody TechnicalPosition query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public TechnicalPosition getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public TechnicalPosition getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
