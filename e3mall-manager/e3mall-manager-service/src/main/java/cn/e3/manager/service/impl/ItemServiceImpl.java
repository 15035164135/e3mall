package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.mapper.TbItemMapper;
import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	@Override
	public TbItem findById(Long id) {
		return itemMapper.selectByPrimaryKey(id);
	}

}
