package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

public class LoginBean {
	private String login;
	private String senha;
	
	public void logar(){
		System.out.println(login + " " + senha);
	}
	
	//M�todo para o clique do bot�o
		public void validarLogin(){
			System.out.println(login + " " + senha);
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
	
}
