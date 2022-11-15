package nyom.foodstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@AllArgsConstructor
@Log4j
public class FoodstoreController {
	
	@RequestMapping("main.fs")
	 public String main(HttpServletRequest request, Model model) {
			
	      return "/main";
	   }
	
	
}
