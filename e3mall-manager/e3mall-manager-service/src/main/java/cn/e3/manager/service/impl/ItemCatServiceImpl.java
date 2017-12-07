package cn.e3.manager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.mapper.TbItemCatMapper;
import cn.e3.manager.service.ItemCatService;
import cn.e3.pojo.TbItemCat;
import cn.e3.pojo.TbItemCatExample;
import cn.e3.pojo.TbItemCatExample.Criteria;
import cn.e3.utils.EasyUITreeNeed;

@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;
	
	@Override
	// 按需查询页面所需数据
	public List<EasyUITreeNeed> findByParentId(Long ParentId) {
		// 创建集合用来封装easyUI所需参数
		List<EasyUITreeNeed> list = new ArrayList<>();
		// 创建example对象
		TbItemCatExample example = new TbItemCatExample();
		
		// 封装查询条件
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(ParentId);
		
		List<TbItemCat> itemList = itemCatMapper.selectByExample(example);
		for (TbItemCat tbItemCat : itemList) {
			// 创建EasyUITreeNeed对象
			EasyUITreeNeed tree = new EasyUITreeNeed();
			tree.setId(tbItemCat.getId().intValue());
			tree.setText(tbItemCat.getName());
			tree.setState(tbItemCat.getIsParent()?"closed":"open");
			list.add(tree);
		}
		return list;
	}

}
