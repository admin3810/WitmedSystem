package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.TelephoneType;
import cn.zs.witmed.service.TelephoneTypeService;
import cn.zs.witmed.transport.system.TelephoneTypeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("telephoneTypeTransportImpl")
@RequestMapping("/system/trans")
public class TelephoneTypeTransportImpl implements TelephoneTypeTransport {
	@Autowired
	private TelephoneTypeService service;

	@PostMapping("/page")
	public PageVO<TelephoneType> getPageByQuery(@RequestBody QueryVO<TelephoneType> queryVO) throws Exception {
		System.out.println("impl");
		TelephoneType query = queryVO.getQuery();
		PageVO<TelephoneType> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<TelephoneType> getListByQuery(@RequestBody TelephoneType query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody TelephoneType query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody TelephoneType query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public TelephoneType getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public TelephoneType getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
