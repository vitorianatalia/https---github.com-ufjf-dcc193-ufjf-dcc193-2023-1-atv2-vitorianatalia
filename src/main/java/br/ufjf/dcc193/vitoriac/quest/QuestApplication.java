package br.ufjf.dcc193.vitoriac.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(QuestApplication.class, args);
		
		//Heroi h1 = HeroiFactory.createHeroi("Conan", 1);
		//Guerreiro h1 = ctx.getBean(Guerreiro.class);

		// Heroi h2 = HeroiFactory.createHeroi("Marc", 0);
		//Clerigo h2 = ctx.getBean(Clerigo.class);

		Missao m1= ctx.getBean(Missao.class);
		// m1.setHeroi(h1);
		m1.iniciar();
		m1.concluir();
	}

}
