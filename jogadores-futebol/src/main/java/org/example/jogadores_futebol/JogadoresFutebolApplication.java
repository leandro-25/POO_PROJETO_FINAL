package org.example.jogadores_futebol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Classe principal da aplicação Spring Boot.
 * Responsável por inicializar e configurar o aplicativo.
 */
@SpringBootApplication
public class JogadoresFutebolApplication {

	/**
	 * Método principal (entry point) da aplicação.
	 * Executa o aplicativo Spring Boot.
	 *
	 * @param args Argumentos da linha de comando (opcional).
	 */
	public static void main(String[] args) {
		SpringApplication.run(JogadoresFutebolApplication.class, args);
	}

}

