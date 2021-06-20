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
import org.springframework.web.bind.annotation.RequestParam;

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
	public String viewProduct(@PathVariable("id") Long id, Model viewModel) {
		Product thisProd = this.pServ.getById(id);
		List<Category> cats  = thisProd.getCategories();
		//System.out.println(cats);
		viewModel.addAttribute("productCat", cats);
		viewModel.addAttribute("prod", this.pServ.getById(id));
		viewModel.addAttribute("allCats", this.cServ.getAll());
		return "viewProduct.jsp";
	}
	
	
	//post map for adding category to a product
	@PostMapping("/product/{id}")
	public String changeProductCategory(@RequestParam("categories") Long catId,@PathVariable("id") Long id, Model viewModel) {
		Product prodForCat = this.pServ.getById(id);
		//System.out.println(id);
		Category cateAdded = this.cServ.getById(catId);
		//System.out.println(catId);
		this.pServ.prodCategory(prodForCat, cateAdded);
		return "redirect:/product/{id}";
	}
	
	//get map category by ID with product selector
	@GetMapping("/category/{id}")
	public String viewCategory(@PathVariable("id") Long id, Model viewModel) {
		Category thisCat = this.cServ.getById(id);
		List<Product> prod = thisCat.getProducts();
		viewModel.addAttribute("catProd", prod);
		viewModel.addAttribute("cate", this.cServ.getById(id));
		viewModel.addAttribute("allProds", this.pServ.getAll());
		return "viewCategory.jsp";
	}
	
	//post map for adding product to category
	@PostMapping("/category/{id}")
	public String changeCategoryProduct(@RequestParam("products") Long prodId, @PathVariable("id") Long id, Model viewModel) {
		Category catForProd = this.cServ.getById(id);
		Product prodAdded = this.pServ.getById(prodId);
		this.cServ.catProduct(catForProd, prodAdded);
		return "redirect:/category/{id}";
	}
}
