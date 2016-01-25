package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ProductVO;

@Controller
public class SimpleController4 {
	
	private static final Logger logger = LoggerFactory.getLogger(SimpleController4.class);
	
	@RequestMapping("/doE") 
	public String doE(RedirectAttributes rttr) {
		logger.info("doE called.......");
		
		// make sample data
		rttr.addFlashAttribute("msg", "This is the Message!! with redirected");
		
		return "redirect:/doF";
	}
	
	@RequestMapping("/doF") 
	public void doF(String msg) {
		logger.info("doF called......." + msg);
	}
	
	
	
}
