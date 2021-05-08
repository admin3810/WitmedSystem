package cn.zs.witmed.controller;

import cn.zs.witmed.base.controller.BaseController;
import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.base.pojo.vo.ResponseVO;
import cn.zs.witmed.pojo.system.entity.OutpatientExpenses;
import cn.zs.witmed.transport.system.OutpatientExpensesTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("outpatientExpensesController")
@RequestMapping("/system/outpatient/expenses")
public class OutpatientExpensesController extends BaseController {
	@Autowired
	private OutpatientExpensesTransport transport;
	@PostMapping("/page/{pageNum}/{pageSize}")
	public ResponseVO getPageByQuery(@PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize") Integer pageSize,
	                                 @RequestBody OutpatientExpenses query) throws Exception {
		// 创建 PageVO 对象
		System.out.println(123);
		System.out.println(query);
		PageVO<OutpatientExpenses> pageVO = new PageVO<OutpatientExpenses>(pageNum, pageSize);
		// 创建 QueryVO 对象
		QueryVO<OutpatientExpenses> queryVO = new QueryVO<OutpatientExpenses>();
		queryVO.setPageVO(pageVO);
		queryVO.setQuery(query);
		// 进行分页查询
		pageVO = transport.getPageByQuery(queryVO);
		System.out.println(pageVO.getList().get(0).getId());
		return ResponseVO.getSuccessResponseVO(pageVO);
	}
	@PostMapping("/query")
	public ResponseVO getByQuery(@RequestBody OutpatientExpenses query) throws Exception {
		return ResponseVO.getSuccessResponseVO(transport.getListByQuery(query));
	}


	@PostMapping("save")
	public ResponseVO save(@RequestBody OutpatientExpenses query) throws Exception {
		String code =query.getCode();
		if (code !=null&&!"".equals(code)){
			OutpatientExpenses OutpatientExpenses = transport.getByCode(code);
			if(OutpatientExpenses ==null){
				if (transport.save(query)==true){
					return ResponseVO.getSuccessResponseVO();
				}
				return ResponseVO.getErrorResponseVO("保存成功");
			}
			return ResponseVO.getErrorResponseVO("该编码已被占用");
		}
		return ResponseVO.getErrorResponseVO("请填写正确信息");
	}


	@PostMapping("/update")
	public ResponseVO update(@RequestBody OutpatientExpenses query) throws Exception {
		String code = query.getCode();
		if (code !=null&&!"".equals(code)){
			OutpatientExpenses OutpatientExpenses = transport.getByCode(code);
			if(OutpatientExpenses == null || OutpatientExpenses.getId().equals(query.getId())){
				if (transport.update(query)){
					return ResponseVO.getSuccessResponseVO();
				}
				return ResponseVO.getErrorResponseVO("保存失败");

			}
			return ResponseVO.getErrorResponseVO("该编码已被占用");
		}else {
			if (transport.update(query)){
				return ResponseVO.getSuccessResponseVO();
			}
			return ResponseVO.getErrorResponseVO("保存失败");
		}
	}


	@PostMapping("/id/{id}")
	public ResponseVO getById(@PathVariable("id") String id) throws Exception {

		return ResponseVO.getSuccessResponseVO(transport.getById(id));
	}


	@PostMapping("/code/{code}")
	public ResponseVO getByCode(@PathVariable("code") String code) throws Exception {
		return  ResponseVO.getSuccessResponseVO(transport.getByCode(code));
	}
}
