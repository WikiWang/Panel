/**
 * @Title: HelloController.java 
 * @Package: com.test.springboot.controller 
 * @Description: TODO
 * @date: Nov 23, 2016
 * @author:  wangkui
 */
package com.test.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.springboot.bean.Chart;
import com.test.springboot.bean.PanelChart;
import com.test.springboot.repo.ChartRepository;
import com.test.springboot.repo.PanelChartRepository;

/**
 * @ClassName: HelloController 
 * @Description: 
 * @author: wk
 * @date: Nov 23, 2016
 */
@Controller
public class PanelController {
	
	@Autowired
	private ChartRepository chartRepository;
	
	@Autowired
	private PanelChartRepository panelChartRepository;
	
	@RequestMapping(value="/panel", method = RequestMethod.GET)
	public String panel(Model model){
		List<Chart> charts = chartRepository.findAll();
		model.addAttribute("charts", charts);
		return "panel";
	}
	
	@RequestMapping(value="/drag", method = RequestMethod.GET)
	public String drag(Model model){
		return "drag";
	}
	
	@RequestMapping(value="/drag2", method = RequestMethod.GET)
	public String drag2(Model model){
		return "drag2";
	}
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(Model model){
		return "index";
	}
	
	@RequestMapping(value="/chart", method = RequestMethod.GET)
	public String chart(Model model){
		return "chart";
	}
}
