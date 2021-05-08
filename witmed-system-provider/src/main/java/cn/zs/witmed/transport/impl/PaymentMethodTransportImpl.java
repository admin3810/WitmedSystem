package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.PaymentMethod;
import cn.zs.witmed.service.PaymentMethodService;
import cn.zs.witmed.transport.system.PaymentMethodTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("paymentMethodTransportImpl")
@RequestMapping("/system/trans")
public class PaymentMethodTransportImpl implements PaymentMethodTransport {
	@Autowired
	private PaymentMethodService service;

	@PostMapping("/page")
	public PageVO<PaymentMethod> getPageByQuery(@RequestBody QueryVO<PaymentMethod> queryVO) throws Exception {
		System.out.println("impl");
		PaymentMethod query = queryVO.getQuery();
		PageVO<PaymentMethod> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<PaymentMethod> getListByQuery(@RequestBody PaymentMethod query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody PaymentMethod query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody PaymentMethod query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public PaymentMethod getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public PaymentMethod getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
