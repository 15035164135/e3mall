package cn.e3.manager.service;

import java.util.List;

import cn.e3.utils.EasyUITreeNeed;

public interface ItemCatService {
	
	/**
	 * 按需查询:
	 * 		需要查询的时候再查询
	 */
	 public List<EasyUITreeNeed> findByParentId(Long ParentId);
}
