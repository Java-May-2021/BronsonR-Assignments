package com.bronson.pnc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bronson.pnc.models.Category;
import com.bronson.pnc.models.Product;
import com.bronson.pnc.services.CateService;
import com.bronson.pnc.services.ProdService;

@Controller
public class HomeController {
	@Autowired
	private ProdService pServ;
	@Autowired
	private CateService cServ;
	
	
	//main page
	@GetMapping("/")
	public String dashboard() {
		return "dashboard.jsp";
	}
	
	//get map add product
	@GetMapping("/product")
	public String addProduct(@ModelAttribute("prod") Product product) {
		return "addProduct.jsp";
	}
	
	//post map add product
	@PostMapping("/product")
	public String productAdded(@Valid @ModelAttribute("prod") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "addProduct.jsp";
		}
		
		this.pServ.createProd(product);
		Long prodId = product.getId();
		return "redirect:/product/" + prodId;
	}
	
	//get map add category
	@GetMapping("/category")
	public String addCategory(@ModelAttribute("cate") Category category) {
		return "addCategory.jsp";
	}
	
	//post map add category
	@PostMapping("/category")
	public String categoryAdded(@Valid @ModelAttribute("cate") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "addCategory.jsp";
		}
		this.cServ.createCate(category);
		Long cateId = category.getId();
		return "redirect:/category/" + cateId;
	}
	
	//get map product by ID with category selector
	@GetMapping("/product/{id}")
	public String viewProduct(@ModelAttribute("cate") Product product, @PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("prod", this.pServ.getById(id));
		viewModel.addAttribute("allCats", this.cServ.getAll());
		return "viewProduct.jsp";
	}
	
	
	//post map for adding category to a product
	@PostMapping("/product/{id}")
	public String changeProductCategory(@Valid @ModelAttribute("cate") Product product, BindingResult result,
			@PathVariable("id") Long id, Model viewModel) {
		
		if(result.hasErrors()) {
			viewModel.addAttribute("prod", this.pServ.getById(id));
			viewModel.addAttribute("allCats", this.cServ.getAll());
			return "viewProduct.jsp";
		}
		return "redirect:/product/{id}";
	}
	
	//get map category by ID with product selector
	@GetMapping("/category/{id}")
	public String viewCategory(@ModelAttribute("prod") Category category, @PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("cate", this.cServ.getById(id));
		viewModel.addAttribute("allProds", this.pServ.getAll());
		return "viewCategory.jsp";
	}
	
	//post map for adding product to category
	@PostMapping("/category/{id}")
	public String changeCategoryProduct(@Valid @ModelAttribute("prod") Category category, BindingResult result, 
			@PathVariable("id") Long id, Model viewModel) {
		
		if(result.hasErrors()) {
			viewModel.addAttribute("cate", this.cServ.getById(id));
			viewModel.addAttribute("allProds", this.pServ.getAll());
			Long cateId = category.getId();
			return "redirect:/category/" + cateId;
		}
		return "redirect:/category/{id}";
	}
}
