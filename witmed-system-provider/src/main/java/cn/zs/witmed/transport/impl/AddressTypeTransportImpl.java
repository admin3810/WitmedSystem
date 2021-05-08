package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.AddressType;
import cn.zs.witmed.service.AddressTypeService;
import cn.zs.witmed.transport.system.AddressTypeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("addressTypeTransportImpl")
@RequestMapping("/system/trans")
public class AddressTypeTransportImpl implements AddressTypeTransport {
	@Autowired
	private AddressTypeService service;

	@PostMapping("/page")
	public PageVO<AddressType> getPageByQuery(@RequestBody QueryVO<AddressType> queryVO) throws Exception {
		System.out.println("impl");
		AddressType query = queryVO.getQuery();
		PageVO<AddressType> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<AddressType> getListByQuery(@RequestBody AddressType query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody AddressType query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody AddressType query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public AddressType getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public AddressType getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
