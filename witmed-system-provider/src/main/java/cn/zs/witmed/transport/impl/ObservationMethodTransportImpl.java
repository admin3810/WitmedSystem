package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.ObservationMethod;
import cn.zs.witmed.service.ObservationMethodService;
import cn.zs.witmed.transport.system.ObservationMethodTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("observationMethodTransportImpl")
@RequestMapping("/system/trans")
public class ObservationMethodTransportImpl implements ObservationMethodTransport {
	@Autowired
	private ObservationMethodService service;

	@PostMapping("/page")
	public PageVO<ObservationMethod> getPageByQuery(@RequestBody QueryVO<ObservationMethod> queryVO) throws Exception {
		System.out.println("impl");
		ObservationMethod query = queryVO.getQuery();
		PageVO<ObservationMethod> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<ObservationMethod> getListByQuery(@RequestBody ObservationMethod query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody ObservationMethod query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody ObservationMethod query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public ObservationMethod getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public ObservationMethod getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
