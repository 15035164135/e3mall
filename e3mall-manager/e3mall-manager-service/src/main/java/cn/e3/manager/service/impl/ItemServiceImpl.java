package cn.e3.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.container.page.PageHandler;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3.manager.mapper.TbItemMapper;
import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;
import cn.e3.pojo.TbItemExample;
import cn.e3.utils.DatagridPagebean;
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	@Override
	public TbItem findById(Long id) {
		return itemMapper.selectByPrimaryKey(id);
	}
	@Override
	public DatagridPagebean findItemListByPage(Integer page, Integer rows) {
		// 创建example对象
		TbItemExample tbItemExample = new TbItemExample();
		// 利用插件设置分页
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(tbItemExample);
		// 创建pageInfo,获取分页信息
		PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);
		long total = pageInfo.getTotal();
		// 分页数据设置
		DatagridPagebean pagebean = new DatagridPagebean();
		pagebean.setRows(list);
		pagebean.setTotal(total);
		// 设置总计路数
		return pagebean;
	}

}
