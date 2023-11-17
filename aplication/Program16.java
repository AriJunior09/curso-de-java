package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.Comentario;
import entidade.Post;

public class Program16 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Faça uma boa viagem!");
		Comentario c2 = new Comentario("Nossa que legal!");
		Post p1 = new Post(
				sdf.parse("14/11/2023 13:05:44"), 
				"Vou viajar para Portugal", 
				"Vou visitar este país maravilhoso!", 
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Boa noite!");
		Comentario c4 = new Comentario("Que a força esteja com você!");
		Post p2 = new Post(
				sdf.parse("16/11/2023 23:14:19"), 
				"Boa noite, galera", 
				"Vejo vocês amanhã!", 
				5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}