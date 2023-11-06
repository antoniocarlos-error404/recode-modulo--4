package br.com.crud.model;

import java.util.Date;

public class cadastro {

private int id;
private String nome;
private String email;
private int senha;
private String endereco;
private String cidade;

public int getId() {
return id;
}
public void setId(int id) { this.id = id;
}
public String getNome() {
return nome;
}

public void setNome(String nome) { this.nome = nome;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public int getSenha () {
return senha;
}

public void setSenha(int senha) { this.senha = senha;
}

public String getEndereco () {
return endereco;
}

public void setEndereco(String endereco) { this.endereco = endereco;
}

public String getCidade () {
return cidade;
}

public void setCidade(String cidade) { this.cidade = cidade;
}

}