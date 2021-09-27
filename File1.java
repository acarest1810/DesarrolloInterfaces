package Ficheros;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void crear() {
		String sistemaoperativo=System.getProperty("os.name");
		if(sistemaoperativo.equals("Linux")) {
			File cUsuario=new File(System.getProperty("user.home"));
			File cPruebas=new File(cUsuario,"Pruebas");
			cPruebas.mkdir();
			File cPrimera=new File(cPruebas,"Primera");
			cPrimera.mkdir();
			File cSegunda=new File(cPruebas,"Segunda");
			cSegunda.mkdir();
			File tUno=new File(cPrimera,"uno.txt");
			try {
				tUno.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			File tDos=new File(cSegunda,"dos.txt");
			try {
				tDos.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			File cTercera=new File(cPrimera,"Tercera");
			cTercera.mkdir();
			File tTres=new File(cTercera,"tres.txt");
			try {
				tTres.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Solo funciona en Linux");
		}
		
	}
}
