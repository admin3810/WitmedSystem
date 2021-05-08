package cn.zs.witmed.dao;

import cn.zs.witmed.pojo.system.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostDao {
	List<Post> findListByQuery (Post query) throws Exception;
	int save(Post query) throws Exception;
	int update(Post query) throws Exception;

}
