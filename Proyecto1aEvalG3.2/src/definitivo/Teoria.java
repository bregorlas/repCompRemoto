package definitivo;

import javax.swing.JOptionPane;

public class Teoria {
	public static void MostrarTeoria(){
		String[] menuStr={"Bloque A", "Bloque B", "Bloque C", "Volver"};
		boolean repetir=true;
		while(repetir){
			int optMenTeoria=JOptionPane.showOptionDialog(null,"Seleccione una opcion","Estas en la teoria",0,JOptionPane.INFORMATION_MESSAGE,null,menuStr,menuStr[0]);
			switch (optMenTeoria){
			case 0: 
				MostrarBloqueA();
				break;
			case 1:
				MostrarBloqueB();
				break;
			case 2:
				MostrarBloqueC();
				break;
			case 3:
				repetir=false;
				break;
			}	
		}		
	}
	
	public static void MostrarBloqueA(){
		String bloque="A) I'm going to do something = I have already decided to do it, I intent to do it:\n"
					+ " -A: The's a film television tonight. Are you going to watch it.\n"
					+ " B: No, I'm tired. I'm going to have an early night.\n"
					+ " -A: I hear Ruth has won some money. What is she going to do whith it\n"
					+ "	B: She's going to buy a new car.\n"
					+ "	-A: Have you made the coffe yet.\n"
					+ "	B: I'm just going to make it.\n"
					+ "-This food looks horrible. I'm not going to eat it.";
		JOptionPane.showMessageDialog(null, bloque);
	}
	public static void MostrarBloqueB(){
		String bloque="B) I'm doing and i'm going to do.\n"
					+ "We normally use i am doing (present continuous) when we say what we have arranged to do - for example, arranged to meet somebody, arranged to go somewhere:\n"
					+ " -What time are you meeting Ann this Evening?\n"
					+ " -I'm leaving tomorrow. I've got my plane ticket.\n"
					+ "`I'm going to do something´: = I've to do it (but perhaps no arranged to do it):\n"
					+ " -The windows are dirty. Yes, I know. I'm going to clean them later (i've decided to clean them but I haven't arranged to clean them)\n"
					+ " -I've decided not to stay here any longer. Tomorrow I'm going to look for somewhere else to stay.\n"
					+ "Often the different is very small and either form is posible";
		JOptionPane.showMessageDialog(null, bloque);
	}
	public static void MostrarBloqueC(){
		String bloque="C) I was going to (do somethig) = I intented to do it but i didn't do it:\n"
					+ " -We were goint to travel by train but then we decided to go by car instead.\n"
					+ "	-A:Did Peter do the examination?\n"
					+ "	 B:No, he has going to do it but he changed his mind\n"
					+ "	-I was just going to cross the road when somebody shouted 'STOP'!\n"
					+ "You can say that something was going to happen (but didn't happen):\n"
					+ "	-I tought it was going to rain but then the sun come out.";
		JOptionPane.showMessageDialog(null, bloque);
	}
}
