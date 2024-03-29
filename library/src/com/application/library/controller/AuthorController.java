package com.application.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.application.library.entity.Author;
import com.application.library.service.AuthorService;

@Controller
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	@GetMapping("/authors")
	public String showAuthors(Model model) {
		model.addAttribute("authors",authorService.findAllAuthors());
		return "authors";
	}
	@GetMapping("/remove-author/{id}")
	public String deleteAuthor(@PathVariable Long id,Model model) {
		authorService.deleteAuthor(id);
		model.addAttribute("authors",authorService.findAllAuthors());
		return "authors";
	}
	@GetMapping("/update-author/{id}")
	public String showUpdateAuthor(@PathVariable Long id,Model model) {
		model.addAttribute("author",authorService.findAuthorById(id));
		return "update-author";
	}
	@PostMapping("/update-author/{id}")
	public String saveUpdateAuthor(Author author,BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {
			return "update-author";
		}
		authorService.updateAuthor(author);
		model.addAttribute("authors",authorService.findAllAuthors());
		return "redirect:/authors";
	}
	@GetMapping("/add-author")
	public String showAddAuthor(Author author) {
		return "add-author";
	}
	@PostMapping("/save-author")
	public String saveAddAuthor(Model model,Author author,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "add-author";
		}
		authorService.createAuthor(author);
		model.addAttribute("",authorService.findAllAuthors());
		return "redirect:/authors";
	}
}
