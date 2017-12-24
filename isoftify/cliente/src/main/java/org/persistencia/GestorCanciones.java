package org.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.dominio.Cancion;

public class GestorCanciones {
	private static GestorCanciones instancia = null;
	private Agente ag;

	private GestorCanciones() {
		try {
			ag = Agente.getInstancia();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static GestorCanciones getGestor() {
		if (instancia == null) {
			instancia = new GestorCanciones();
		}

		return instancia;
	}

	public int guardarCancion(Cancion c) {
		int res = 0;
		String sql = String.format(Locale.US,
				"INSERT INTO CANCIONES (titulo, autor, album_id, anio, duracion, precio) VALUES ('%s', '%s', %d, %d, '%s', %f);",
				c.getNombre_cancion(), c.getAutor(), c.getAlbum().getId(), c.getAnio(), c.getDuracion(), c.getPrecio());

		try (PreparedStatement stmt = ag.getStatement(sql)) {
			res = stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	public int actualizarCancion(Cancion c) {
		// return GestorDatos.getGestor().actualizarArchivo(c);
		return 0;
	}

	public int numCanciones() {
		int n = 0;

		try (PreparedStatement stmt = ag.getStatement("SELECT COUNT(id) FROM CANCIONES;")) {
			try (ResultSet res = stmt.executeQuery()) {
				while (res.next()) {
					n = res.getInt(1);
				}

				res.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return n;
	}

	public ArrayList<Cancion> conseguirTodasCanciones() {
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();

		try {
			PreparedStatement stmt = ag.getStatement("SELECT * FROM CANCIONES;");
			try (ResultSet res = stmt.executeQuery()) {
				while (res.next()) {
					canciones.add(new Cancion(res.getInt("id"), res.getString("titulo"), res.getString("autor"),
							GestorAlbumes.getGestor().buscarAlbumPorId(res.getInt("album_id")), res.getInt("anio"),
							res.getString("duracion"), res.getFloat("precio")));
				}

				res.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return canciones;
	}

	public Cancion[] conseguirCancionesPorAlbum(int album_id) {
		return null;
	}

	public Cancion[] buscarCanciones(int modo, String busqueda) {
		/*
		 * Modos: - 1: Album - 2: artista - 3: titulo
		 */

		// switch (modo) {
		// case 1:
		// return GestorDatos.getGestor().buscarAlbum(busqueda);
		// case 2:
		// return GestorDatos.getGestor().buscarArtista(busqueda);
		// case 3:
		// return GestorDatos.getGestor().buscarTitulo(busqueda);
		// }

		return null;
	}

	public Cancion buscarCancionPorTitulo(String titulo) {
		Cancion cancion = null;
		String sql = String.format("SELECT * FROM CANCIONES WHERE titulo='%s';", titulo);

		try (PreparedStatement stmt = ag.getStatement(sql)) {
			try (ResultSet res = stmt.executeQuery()) {
				while (res.next()) {
					cancion = new Cancion(res.getInt("id"), res.getString("titulo"), res.getString("autor"),
							GestorAlbumes.getGestor().buscarAlbumPorId(res.getInt("album_id")), res.getInt("anio"),
							res.getString("duracion"), res.getFloat("precio"));
				}

				res.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cancion;
	}

	public int borrarCancion(int id) {
		int res = 0;
		String sql = String.format("DELETE FROM CANCIONES WHERE id=%d", id);

		try (PreparedStatement stmt = ag.getStatement(sql)) {
			res = stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}
}
