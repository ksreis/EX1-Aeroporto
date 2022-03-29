package view;

import java.util.concurrent.Semaphore;

import controller.showBr;

public class principal {

	public static void main(String[] args) {
		int permissoes = 1;
		int ingressos = 0;
		int usuario = 0;
		Semaphore semaphore = new Semaphore(permissoes);
		for (usuario = 1; usuario <= 300; usuario++) {
			ingressos = (int) ((Math.random() * 4) + 1);
			Thread login = new showBr(usuario, ingressos, semaphore);
			login.start();
		}

	}
}