 package org.RF5;

public class GestorCuentas {
	CuentaUsuario[] usuarios;
	
	public void consultarCuentas() {
		for(int i=0; i < usuarios.length - 1; i++)
			System.out.println("Usuario " + i + ": " + usuarios[i].getUserName());
	}
}
