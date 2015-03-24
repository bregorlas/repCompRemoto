package definitivo;

import javax.swing.JOptionPane;

public class Menu{	
	public Menu(){
		crearMenu();
	}
	private void crearMenu(){
		String[] menuStr={"1.Ver teoria", "2.Realizar ejercicio", "3.Realizar ejercicio con ayuda", "4.Salir"};/*array que lleva las opciones a mostrar*/
		boolean repetir=true;/*variable que controla la salida del menu*/
		while(repetir){/*mientras no pulse Exit(3) se va a repetir*/
			//JOptionPane.showOptionDialog(frame contenedor, "texto dentro", "titulo", tipo(0 porque ya le doy yo los botones), icono, icono personalizado, array, foco)
			int optMenPrincipal=JOptionPane.showOptionDialog(null,"Seleccione una opción:","Wellcome to our APP",0,JOptionPane.INFORMATION_MESSAGE,null,menuStr,menuStr[1]);
			switch (optMenPrincipal){
				case 0: 
					Teoria.MostrarTeoria();
					break;
				case 1:
					JuegoG3.Jugar(false);/*cuando yo pase false no mostrara ayuda*/
					break;
				case 2:
					JuegoG3.Jugar(true);/*cuando yo pase true mostrara las ayudas*/
					break;
				case 3:
					repetir=false;
					break;
			}
		}		
	}
}
