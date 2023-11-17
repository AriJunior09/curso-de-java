package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private String titulo;
	private String conteudo;
	private Integer curtidas;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	
	public Post() {
		
	}

	public Post(Date moment, String titulo, String conteudo, Integer curtidas) {
		this.moment = moment;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.curtidas = curtidas;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removeComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(curtidas);
		sb.append(" Curtidas - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentários:\n");
		for (Comentario c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
	
	
	
	
}
