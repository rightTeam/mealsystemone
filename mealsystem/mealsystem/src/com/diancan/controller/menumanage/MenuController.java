package com.diancan.controller.menumanage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diancan.entity.Page;
import com.diancan.service.menumanage.MenuMManager;
import com.diancan.util.PageData;

@Controller
@RequestMapping(value = "/menumanage")
// 窄化，方便模块开发
public class MenuController {
	
	@Resource(name = "menumanagerService")
	private MenuMManager menumanagerService;

	@RequestMapping("/list")
	public String list() throws Exception {
		PageData pd = new PageData();
		return "menumanage/menu_list";
	}
}
