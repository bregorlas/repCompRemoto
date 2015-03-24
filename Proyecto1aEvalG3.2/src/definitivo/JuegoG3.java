package definitivo;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
public class JuegoG3 {
	public static void Jugar(boolean ayuda) {		
		final int MEZCLA=999999;/*variable fija, para mezclar los vectores tantas veces*/
		final int CANT_PREG=17;/*variable fija para determinar la cantidad de preguntas que caben en los vectores*/
		String[] titulosEjercicios= new String[5];/*inicializacion y carga de los titulos de ejercicios, habran 5 ejercicios*/
		CargaVectores.cargarTitulosEjercicios(titulosEjercicios);
		int[] tituloPreguntas= new int[CANT_PREG];/*este vector guarda el indice de titulo para cada indice de ejercicio*/
		CargaVectores.cargarTituloPreguntas(tituloPreguntas);
		String[] preguntas=new String[CANT_PREG];/*inicializacion y carga del vector de preguntas*/
		CargaVectores.cargarPreguntas(preguntas);
		String[] respuestas=new String[CANT_PREG];/*inicializacion y carga del vetor de respuestas, separando cuando hay varias con #*/
		CargaVectores.cargarRespuestas(respuestas);			
		/*desordenar el vector de preguntas para que no repita selecciones y realizarle lo mismo al vector de respuestas y de titulos*/
		for(int i=0; i<MEZCLA; i++){
			int pos1=(int)(Math.random()*preguntas.length);
			int pos2=(int)(Math.random()*preguntas.length);
			String temp=preguntas[pos1];
			preguntas[pos1]=preguntas[pos2];
			preguntas[pos2]=temp;
			String temp2=respuestas[pos1];
			respuestas[pos1]=respuestas[pos2];
			respuestas[pos2]=temp2;
			int temp3=tituloPreguntas[pos1];
			tituloPreguntas[pos1]=tituloPreguntas[pos2];
			tituloPreguntas[pos2]=temp3;
		}		
		/*una vez desordenado los vectores completos cojo sus 10 primeros en nuevos arrays para usarlos en cada ronda*/
		final int CANT_PREG_RONDA=10;/*variable fija que determinara las veces que metera una pregunta de la bateria a la ronda*/
		String[] preguntasRonda=new String[CANT_PREG_RONDA];/*inicializacion de los vectores que cargaran las preguntas y respuestas de la ronda*/
		String[] respuestasRonda=new String[CANT_PREG_RONDA];
		for (int i=0; i<CANT_PREG_RONDA; i++){/*cargando preguntas y respuestas en vectores nuevos*/
			preguntasRonda[i]=preguntas[i];
			respuestasRonda[i]=respuestas[i];
		} 		
		/*simulando juego*/
		String usuario="";/*inicializando la variable que el usuario usara para introducir texto*/
		long tiempoInicial=System.currentTimeMillis();/*inicio de la cuenta del tiempo*/
		for(int i=0; i<preguntasRonda.length; i++){/*por cada pregunta en el vector de la ronda*/
			//int nTit=tituloPreguntas[i];/*guardo el valor numerico del titulo con indice i*/			
			if(ayuda){/*si al metodo se a accedido con la variable ayuda a true(ejercicio con ayuda)*/
				String r=respuestas[i].replace("#", " ' OR ' ");/*sustituyo los # de la string del vector por algo visualmente mejor*/
				usuario=JOptionPane.showInputDialog(null,i+1 +"- "+ titulosEjercicios[tituloPreguntas[i]] +"\n"+ preguntasRonda[i] +"\n ' "+ r +" '");/*muestro titulo correspondiente al numero de i, su pregunta y su respuesta*/
			}else{/*si al metodo se accede con la variable ayuda a false(ejercicio normal)*/
				usuario=JOptionPane.showInputDialog(null,i+1 +"- "+ titulosEjercicios[tituloPreguntas[i]] +"\n"+ preguntasRonda[i]);/*muestro titulo correspondiente a i y solo su pregunta*/	
			}			
			String[] respuestaConcreta=respuestasRonda[i].split("#");/*segmento la respuesta con varias posigilidades usando como separador #*/
			/*comprobar si valor esta en respuestaConcreta, busqueda secuencial*/
			boolean encontrado=false;/*variable que determinara si la respuesta se a encontrado en algun segmento(true) o no(false)*/
			int j=0;/**/
			while(!encontrado && j<respuestaConcreta.length){/*mientras encontrado=false Y i menor que largo de array s*/
				if(respuestaConcreta[j].equals(usuario)){
					encontrado=true;
				}else{
					j=j+1;
				}
			}
			/*captacion de la salida*/
			if(encontrado){
				JOptionPane.showMessageDialog(null, "Correcto!");
			}else{
				if(usuario == null){					
					new Menu();
					System.exit(0);
				}
				String r=respuestas[i].replace("#", " ' O ' ");/*sustituyo los # de la string del vector por algo visualmente mejor*/
				JOptionPane.showMessageDialog(null, "Incorrecto! La respuesta correcta es: ' "+ r +" '");
				i=-1;
			}			
		}
		long tiempoFinal=System.currentTimeMillis();			
		long milisegundos=(tiempoFinal-tiempoInicial);
		long minutos=TimeUnit.MILLISECONDS.toSeconds(milisegundos)/60;
		long segundos=TimeUnit.MILLISECONDS.toSeconds(milisegundos)%60;	
		milisegundos=milisegundos%1000;
		minutos=minutos%60;
		/*escala de nota por tiempo tardado*/
		String nota="";
		if(minutos <= 10){//si minutos menor a 10
			nota="sobresaliente(9-10'')";
		}else if((minutos <= 12) && (minutos > 10)){
			nota="notable(7-8'')";
		}else if((minutos <= 13) && (minutos > 12)){
			nota="bien(6'')";
		}else if((minutos <= 15) && (minutos > 13)){
			nota="suficiente(5'')";
		}else if(minutos > 15){
			nota="suspendido(menos de 5'')";
		}
		JOptionPane.showMessageDialog(null, "Has terminado, tu nota es: "+ nota +"\nY has tardado: "+ minutos +" minutos, "+ segundos +" segundos y "+ milisegundos +" milisegundos");
	}
}
