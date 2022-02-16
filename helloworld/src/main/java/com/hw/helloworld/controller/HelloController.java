package com.hw.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String getHello () { // meu método sempre em Caixa alta
		return "Hello World pra quem??";
	}
	
	@GetMapping("/familia44")
	public String getHello2 () { // meu método sempre em Caixa alta
		return "Hello Familia!";
	}
	
	@GetMapping("/habilidades")
	public String getHello3 () { // meu método sempre em Caixa alta
		return "Para esta atividade foram utilizadas as Habilidades: Atenção aos Detalhes e Proatividade! <br /> Para esta atividade foram utilizadas a Mentalidade: Persistência";
	}
	
	@GetMapping("/objetivos")
	public String getHello4 () { // meu método sempre em Caixa alta
		return "<b> Para esta semana os objetivos são:</b>  <br /> 1- Revisar conteúdos do Bloco I, <br />"
				+ "2- Revisar o Projeto integrador, <br /> 3- Conseguir dormir mais horas/noite";
	}
	
	
}
