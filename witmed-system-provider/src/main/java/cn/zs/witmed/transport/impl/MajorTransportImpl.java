package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.Major;
import cn.zs.witmed.service.MajorService;
import cn.zs.witmed.transport.system.MajorTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("majorTransportImpl")
@RequestMapping("/system/trans")
public class MajorTransportImpl implements MajorTransport {
	@Autowired
	private MajorService service;

	@PostMapping("/page")
	public PageVO<Major> getPageByQuery(@RequestBody QueryVO<Major> queryVO) throws Exception {
		System.out.println("impl");
		Major query = queryVO.getQuery();
		PageVO<Major> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<Major> getListByQuery(@RequestBody Major query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody Major query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody Major query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public Major getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public Major getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
