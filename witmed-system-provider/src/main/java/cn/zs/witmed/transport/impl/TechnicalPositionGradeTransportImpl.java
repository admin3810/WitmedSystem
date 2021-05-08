package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.TechnicalPositionGrade;
import cn.zs.witmed.service.TechnicalPositionGradeService;
import cn.zs.witmed.transport.system.TechnicalPositionGradeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("technicalPositionGradeTransportImpl")
@RequestMapping("/system/trans")
public class TechnicalPositionGradeTransportImpl implements TechnicalPositionGradeTransport {
	@Autowired
	private TechnicalPositionGradeService service;

	@PostMapping("/page")
	public PageVO<TechnicalPositionGrade> getPageByQuery(@RequestBody QueryVO<TechnicalPositionGrade> queryVO) throws Exception {
		System.out.println("impl");
		TechnicalPositionGrade query = queryVO.getQuery();
		PageVO<TechnicalPositionGrade> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<TechnicalPositionGrade> getListByQuery(@RequestBody TechnicalPositionGrade query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody TechnicalPositionGrade query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody TechnicalPositionGrade query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public TechnicalPositionGrade getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public TechnicalPositionGrade getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
