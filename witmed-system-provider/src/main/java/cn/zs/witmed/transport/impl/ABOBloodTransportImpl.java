package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.ABOBlood;
import cn.zs.witmed.service.ABOBloodService;
import cn.zs.witmed.transport.system.ABOBloodTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("aBOBloodTransportImpl")
@RequestMapping("/system/trans")
public class ABOBloodTransportImpl implements ABOBloodTransport {
	@Autowired
	private ABOBloodService service;

	@PostMapping("/page")
	public PageVO<ABOBlood> getPageByQuery(@RequestBody QueryVO<ABOBlood> queryVO) throws Exception {
		System.out.println("impl");
		ABOBlood query = queryVO.getQuery();
		PageVO<ABOBlood> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<ABOBlood> getListByQuery(@RequestBody ABOBlood query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody ABOBlood query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody ABOBlood query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public ABOBlood getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public ABOBlood getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
