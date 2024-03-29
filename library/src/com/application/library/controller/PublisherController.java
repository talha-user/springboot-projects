package com.application.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.application.library.entity.Publisher;
import com.application.library.service.PublisherService;

@Controller
public class PublisherController {

	@Autowired
	private PublisherService publisherService;
	
	@GetMapping("/publishers")
	public String showPublishers(Model model) {
		model.addAttribute("publishers", publisherService.findAll());
		return "publishers";
	}
	@GetMapping("/update-publisher/{id}")
	public String updatePublisher(@PathVariable Long id,Model model,Publisher publisher) {
		model.addAttribute("publisher",publisherService.findPublisherById(id));
		return "update-publisher";
	}
	@PostMapping("/update-publisher/{id}")
	public String saveUpdatePublisher(Model model,Publisher publisher,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "update-publisher";
		}
		publisherService.updatePublisher(publisher);
		model.addAttribute("publishers",publisherService.findAll());
		return "redirect:/publishers";
	}
	@GetMapping("/remove-publisher/{id}")
	public String deletePublisher(@PathVariable Long id,Model model) {
		publisherService.deletePublisher(id);
		model.addAttribute("publishers",publisherService.findAll());
		return "publishers";
	}
	@GetMapping("/add-publisher")
	public String showCreatePublisher(Publisher publisher) {
		return "add-publisher";
	}
	@PostMapping("/save-publisher")
	public String createPublisher(Model model,Publisher publisher) {
		publisherService.createPublisher(publisher);
		model.addAttribute("publishers",publisherService.findAll());
		return "add-publisher";
	}
}
