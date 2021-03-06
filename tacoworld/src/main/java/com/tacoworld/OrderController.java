package com.tacoworld;

import lombok.extern.slf4j.Slf4j;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tacoworld.TacoOrder;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

	@GetMapping
	public String orderForm(Model model) {
		model.addAttribute("tacoOrder", new TacoOrder());
		return "orderForm";
	}
	
	@PostMapping
	public String processOrder(@Valid TacoOrder tacoOrder, BindingResult result) {
		if(result.hasErrors()) {
			return "orderForm";
		}
		else {
			log.info("Order submitted: " + tacoOrder);
			return "redirect:/";
		}
		
		
	}
}
