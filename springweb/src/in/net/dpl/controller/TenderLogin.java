package in.net.dpl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

	
	@Controller
	@RequestMapping("/tenderLogin.htm")
	public class TenderLogin{
		@RequestMapping(method = RequestMethod.GET)
		public ModelAndView index(){
	 
			ModelAndView model = new ModelAndView("tender_login"); 
			return model;
		}
}
