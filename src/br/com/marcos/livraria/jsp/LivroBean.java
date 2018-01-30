/**
 * 
 */
/**
 * @author msrj
 *
 */
package br.com.marcos.livraria.jsp;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;

	}
	public void gravar() {
		System.out.println("Livro Gravado " + this.livro.getTitulo());
	}
}