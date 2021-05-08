package cn.zs.witmed.base.pojo.vo;

import java.io.Serializable;

public class QueryVO<E> implements Serializable {
	private static final long serialVersionUID = -763341544947059407L;
	private E query;

	public E getQuery() {
		return query;
	}

	public void setQuery(E query) {
		this.query = query;
	}

	public PageVO<E> getPageVO() {
		return pageVO;
	}

	public void setPageVO(PageVO<E> pageVO) {
		this.pageVO = pageVO;
	}

	private PageVO<E> pageVO;
}
