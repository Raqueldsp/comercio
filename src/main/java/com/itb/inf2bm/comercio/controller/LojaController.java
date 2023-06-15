package com.itb.inf2bm.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	
	@GetMapping("/listar")
	 public String ListarProdutos() {
		 System.out.println("LISTA DE PRODUTOS!");
		 
		 return "produtos.html"; //retorna o template
		 
		 
	 }
}
