package com.diancan.service.menumanage.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.diancan.dao.DaoSupport;
import com.diancan.entity.Page;
import com.diancan.service.menumanage.MenuMManager;
import com.diancan.util.PageData;

@Service(value="menumanagerService")
public class MenuManagerService implements MenuMManager{

	
	@Resource(name = "daoSupport")
	private DaoSupport dao;
	@Override
	public void save(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		//dao.save("MenuManageMapper", pd);
	}

	@Override
	public void delete(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PageData> list() throws Exception {
		return (List<PageData>) dao.findForList("MenuManageMapper.listAll","");
	}

	@Override
	public List<PageData> list(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
