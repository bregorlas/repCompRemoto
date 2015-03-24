package definitivo;
/*comentario de prueba*/
public class CargaVectores {	
	public static String[] cargarTitulosEjercicios(String[] titulosEjercicios){
		String[] titulosEjerciciosCargados=titulosEjercicios;
		titulosEjerciciosCargados[0]="Answer the questions. You are going to do all these things but you haven't done them yet.\n"
				+ "Use going to and the word(s) in brackets.\n"
				+ "Ex: Have you cleaned the car?\n"
				+ "-(tomorrow) Not yet, I'm going to clean it tomorrow.\n";
		titulosEjerciciosCargados[1]="Write a question whit going to for each situation.\n"
					+ "Ex: Your friend has won some money. You ask:\n"
					+ "-(what/do with it?) What are you going to do with it?\n";
		titulosEjerciciosCargados[2]="Read the situations and complete the dialogues. Use going to.\n"
					+ "Ex: You have decided to write some letters this evening.\n"
					+ "-FRIEND: Are you going out this evening? YOU: No, I'm going to write some letters.\n";
		titulosEjerciciosCargados[3]="What is going to happen in these situations? Use the words in brackets.\n"
					+ "Ex:There are a lot of black clouds in the sky.\n" 
					+ "-(rain) It's going to rain.\n";
		titulosEjerciciosCargados[4]="Complete the sentences with was/were going to + one of these verbs: `give up´ `have´ `phone´ `play´ `travel´.\n"
					+ "Ex: We were going to travel by train but then we decided to go by car instead.\n";
		return titulosEjerciciosCargados; 
	}	
	public static int[] cargarTituloPreguntas(int[] tituloPreguntas){
		int[] tituloPreguntasCargadas=tituloPreguntas;
		tituloPreguntasCargadas[0]=0;
		tituloPreguntasCargadas[1]=0;
		tituloPreguntasCargadas[2]=0;
		tituloPreguntasCargadas[3]=0;
		tituloPreguntasCargadas[4]=1;
		tituloPreguntasCargadas[5]=1;
		tituloPreguntasCargadas[6]=1;
		tituloPreguntasCargadas[7]=2;
		tituloPreguntasCargadas[8]=2;
		tituloPreguntasCargadas[9]=2;
		tituloPreguntasCargadas[10]=3;
		tituloPreguntasCargadas[11]=3;
		tituloPreguntasCargadas[11]=3;
		tituloPreguntasCargadas[13]=4;
		tituloPreguntasCargadas[14]=4;
		tituloPreguntasCargadas[15]=4;
		tituloPreguntasCargadas[16]=4;	
		return tituloPreguntasCargadas; 
	}	
	public static String[] cargarPreguntas(String[] preguntas){
		String[] preguntasCargadas=preguntas;
		preguntasCargadas[0]="Have you phoned Sally? (later) Not yet. .....";
		preguntasCargadas[1]="Have you done the shopping? (this afternoon) Not yet. .....";
		preguntasCargadas[2]="Have you read the paper? (after dinner) Not .....";
		preguntasCargadas[3]="Have you had dinner? (just) .....";
		preguntasCargadas[4]="Your friend is going to a party tonight. You ask: (what/wear) .....";
		preguntasCargadas[5]="Your friend has just bought a new table. You ask: (where/put it) .....";
		preguntasCargadas[6]="Your friend has decided to have a party. You ask: (who/invite) .....";
		preguntasCargadas[7]="You are a smoker but you have decided to give it up soon.\nFriend: Smoking is very bad for you.\nYou: I know. .....";
		preguntasCargadas[8]="You have been offered a job but you decided not to take it.\nFriend:I hear you've been offered a job.\nYou: That's right, but .....";
		preguntasCargadas[9]="You are in a restaurant. The food is awful and you've decided to complain.\nFriend: This food is awful, isn't it?\nYou: Yes, It's disgusting .....";
		preguntasCargadas[10]="It is a 8.30. Jack is leaving his house. He has to be at work at 8.45 but the journey takes 30 minutes.\n (late) He .....";
		preguntasCargadas[11]="There is a hole in the bottom of the boat. A lot of water is coming in through the hole.\n(sink). The boat .....";
		preguntasCargadas[12]="Emma is driving. There is a very little petrol left in the tank. The nearest petrol station is a long way away.\n(run out) She .....";
		preguntasCargadas[13]="We ..... tennis yesterday but it rained all day.";
		preguntasCargadas[14]="I ..... Jim, but I decide to write him a letter instead.";
		preguntasCargadas[15]="When I last saw Tim, he ..... his job but in the end he decided not to.";
		preguntasCargadas[16]="We ..... a party last week but some of our friends couldn't come, so we cancelled it.";
		return preguntasCargadas;
	}	
	public static String[] cargarRespuestas(String[] respuestas){
		String[] respuestasCargadas=respuestas;
		respuestasCargadas[0]="I'm going to phone her later#I am going to phone her later";
		respuestasCargadas[1]="I'm going to do this afternoon#I am going to do this afternoon";
		respuestasCargadas[2]="yet, I'm going to read it after dinner#yet, I am going to read it after dinner";
		respuestasCargadas[3]="I'm just going to have it#I am just going to have it#Not yet, I'm just going to have it#not yet, I'm just going to have it#Not yet, I am just going to have it#not yet, I am just going to have it";
		respuestasCargadas[4]="What are you going to wear?#what are you going to wear?";
		respuestasCargadas[5]="Where are you going to put it?#where are you going to put it?";
		respuestasCargadas[6]="Who are you going to invite?#who are you going to invite?";
		respuestasCargadas[7]="I'm going to give it up#I am going to give it up";
		respuestasCargadas[8]="I'm not going to take it#I am not going to take it";
		respuestasCargadas[9]="I'm going to complain#I am going to complain";
		respuestasCargadas[10]="is going to be late#'s going to be late";
		respuestasCargadas[11]="is going to sink#'s going to sink";
		respuestasCargadas[12]="is going to run out of petrol#'s going to run out of petrol";
		respuestasCargadas[13]="were going to play";
		respuestasCargadas[14]="was going to phone";
		respuestasCargadas[15]="was going to give up";
		respuestasCargadas[16]="were going to have";
		return respuestasCargadas;
	}	
}
