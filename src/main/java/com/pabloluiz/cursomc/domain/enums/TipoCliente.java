package com.pabloluiz.cursomc.domain.enums;

public enum TipoCliente {
	PESSOAFISICA (1, "Pessoa Física"),
	PESSOAJURIDICA (2, "Pessoa Jurídica");
	
	private int codigo;
	private String descricao;
	
	private TipoCliente(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static TipoCliente toEnum (Integer codigo) {
		if (codigo == null)
			return null;
		
		for (TipoCliente tipo : TipoCliente.values()) {
			if (codigo.equals(tipo.getCodigo()))
					return tipo;
		}
		
		throw new IllegalArgumentException("Id inválido: " + codigo);
	}
}
