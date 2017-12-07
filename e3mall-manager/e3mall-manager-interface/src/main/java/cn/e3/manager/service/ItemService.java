package cn.e3.manager.service;

import cn.e3.pojo.TbItem;
import cn.e3.utils.DatagridPagebean;

public interface ItemService {
	// id 查询
	public TbItem findById(Long id);

	// 分页显示列表
	public DatagridPagebean findItemListByPage(Integer page, Integer rows);
}
