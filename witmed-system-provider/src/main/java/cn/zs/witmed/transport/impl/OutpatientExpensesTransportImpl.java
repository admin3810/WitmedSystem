package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.OutpatientExpenses;
import cn.zs.witmed.service.OutpatientExpensesService;
import cn.zs.witmed.transport.system.OutpatientExpensesTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("outpatientExpensesTransportImpl")
@RequestMapping("/system/trans")
public class OutpatientExpensesTransportImpl implements OutpatientExpensesTransport {
	@Autowired
	private OutpatientExpensesService service;

	@PostMapping("/page")
	public PageVO<OutpatientExpenses> getPageByQuery(@RequestBody QueryVO<OutpatientExpenses> queryVO) throws Exception {
		System.out.println("impl");
		OutpatientExpenses query = queryVO.getQuery();
		PageVO<OutpatientExpenses> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<OutpatientExpenses> getListByQuery(@RequestBody OutpatientExpenses query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody OutpatientExpenses query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody OutpatientExpenses query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public OutpatientExpenses getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public OutpatientExpenses getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
