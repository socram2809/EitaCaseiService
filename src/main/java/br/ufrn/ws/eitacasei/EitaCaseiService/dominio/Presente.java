package br.ufrn.ws.eitacasei.EitaCaseiService.dominio;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Classe de domínio que represente o presente que o casal deseja
 * @author Marcos
 *
 */
@Entity
public class Presente {
	
	/**
	 * Identificador
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * Nome do produto
	 */
	@NotEmpty
	private String produto;
	
	/**
	 * Foto do presente
	 */
	@NotEmpty
	@Lob
	private byte[] foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

}
