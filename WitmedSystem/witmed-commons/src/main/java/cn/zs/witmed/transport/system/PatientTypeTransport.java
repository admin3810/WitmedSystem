package cn.zs.witmed.transport.system;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.PatientType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "witmed-system-provider")
@RequestMapping("/system/trans")
public interface PatientTypeTransport {
	/**
	 * <b>分页查询</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<PatientType> getPageByQuery(@RequestBody QueryVO<PatientType> queryVO)throws Exception;

	/**
	 * <b>全查</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/query")
	List<PatientType> getListByQuery(@RequestBody PatientType query)throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody PatientType query)throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody PatientType query)throws Exception;

	/**
	 * <b>根据Drug查对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	PatientType getById(@RequestParam String id)throws Exception;

	/**
	 * <b>根据Code查对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	PatientType getByCode(@RequestParam String code)throws Exception;
}