package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.PastObservations;
import cn.zs.witmed.service.PastObservationsService;
import cn.zs.witmed.transport.system.PastObservationsTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("pastObservationsTransportImpl")
@RequestMapping("/system/trans")
public class PastObservationsTransportImpl implements PastObservationsTransport {
	@Autowired
	private PastObservationsService service;

	@PostMapping("/page")
	public PageVO<PastObservations> getPageByQuery(@RequestBody QueryVO<PastObservations> queryVO) throws Exception {
		System.out.println("impl");
		PastObservations query = queryVO.getQuery();
		PageVO<PastObservations> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<PastObservations> getListByQuery(@RequestBody PastObservations query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody PastObservations query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody PastObservations query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public PastObservations getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public PastObservations getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
