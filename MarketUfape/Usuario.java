import java.time.LocalDate;

public class Usuario {
	

	private int id;
	private String nome;
	private String emailInstitucional;
	private String senha;
	private LocalDate dataNascimento;
	private String curso;
	private String fotoPerfil;
	private String biografia;

    public Usuario(int id, String nome, String emailInstitucional, String senha,
            LocalDate dataNascimento, String curso, String fotoPerfil, String biografia) {
    	this.id = id;
    	this.nome = nome;
    	this.emailInstitucional = emailInstitucional;
    	this.senha = senha;
    	this.dataNascimento = dataNascimento;
    	this.curso = curso;
    	this.fotoPerfil = fotoPerfil;
    	this.biografia = biografia;
    }
	
   public String getNome() {
        return nome;
    }
    
   public void setNome(String nome) {
       this.nome = nome;
   }

   public String getEmailInstitucional() {
       return emailInstitucional;
   }

   public void setEmailInstitucional(String emailInstitucional) {
       this.emailInstitucional = emailInstitucional;
   }
}
