
package com.proyecto1.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.proyecto1.demo.Models.Entity.DAO.ProductDAO;
import com.proyecto1.demo.Models.Entity.Product;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	private ProductDAO productDAO;

	@GetMapping
	public String getAllProducts(Model model) {
		model.addAttribute("productos", productDAO.findAll());
		return "productos/list";
	}

	@GetMapping("/new-product")
	public String getNewProductForm(Model model) {
		model.addAttribute("producto", new Product());
		return "productos/form";
	}

	@PostMapping("/save")
	public String saveProduct(@ModelAttribute("producto") Product producto) {
		productDAO.save(producto);
		return "redirect:/productos";
	}

	@GetMapping("/edit/{id}")
	public String getEditProductForm(@PathVariable Long id, Model model) {
		model.addAttribute("producto", productDAO.findById(id));
		return "productos/form";
	}

	@PostMapping("/update/{id}")
	public String updateProduct(@PathVariable Long id, @ModelAttribute("producto") Product producto) {
		productDAO.update(id, producto);
		return "redirect:/productos";
	}

	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productDAO.delete(id);
		return "redirect:/productos";
	}
}

