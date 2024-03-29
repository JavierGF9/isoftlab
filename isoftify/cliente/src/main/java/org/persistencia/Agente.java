package org.persistencia;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Agente {
	private static final String driver = "org.h2.Driver";
	private static final String ruta = "base_datos";
	private static final String user = "isoftlab";
	private static final char[] password = "isoft".toCharArray();
	
	private static Agente instancia = null;
	private Connection conexion;
	private String url;
	
	private Agente() throws Exception {
		File archivo = new File(ruta);
		url = "jdbc:h2:file:" + archivo.getAbsolutePath().replace("\\\\", "/");
		
		Class.forName(driver);
		conexion = DriverManager.getConnection(url, user, new String(password));
	}

	public static Agente getInstancia() throws Exception {
		if (instancia == null) {
			instancia = new Agente();
		}
		
		return instancia;
	}
	
	public PreparedStatement getStatement(String sql) throws Exception {
		return conexion.prepareStatement(sql);
	}
	
	public void cerrarConexion() throws Exception {
		conexion.close();
	}
}
