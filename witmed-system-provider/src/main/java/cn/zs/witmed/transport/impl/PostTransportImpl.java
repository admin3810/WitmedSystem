package cn.zs.witmed.transport.impl;

import cn.zs.witmed.base.pojo.vo.PageVO;
import cn.zs.witmed.base.pojo.vo.QueryVO;
import cn.zs.witmed.pojo.system.entity.Post;
import cn.zs.witmed.service.PostService;
import cn.zs.witmed.transport.system.PostTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("postTransportImpl")
@RequestMapping("/system/trans")
public class PostTransportImpl implements PostTransport {
	@Autowired
	private PostService service;

	@PostMapping("/page")
	public PageVO<Post> getPageByQuery(@RequestBody QueryVO<Post> queryVO) throws Exception {
		System.out.println("impl");
		Post query = queryVO.getQuery();
		PageVO<Post> pageVO= queryVO.getPageVO();

		return service.getPageByQuery(query,pageVO);
	}


	@PostMapping("/query")
	public List<Post> getListByQuery(@RequestBody Post query) throws Exception {
		return service.getListByQuery(query);
	}


	@PostMapping("save")
	public boolean save(@RequestBody Post query) throws Exception {
		return service.save(query);
	}


	@PostMapping("/update")
	public boolean update(@RequestBody Post query) throws Exception {
		return service.update(query);
	}


	@PostMapping("/id")
	public Post getById(@RequestParam String id) throws Exception {

		return service.getById(id);
	}

	@Override
	@PostMapping("/code")
	public Post getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}
