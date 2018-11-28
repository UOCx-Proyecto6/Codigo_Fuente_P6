package interfaces;

import razas.Raza;

public interface DAODatos {
	
	public void registrar(Raza raz) throws Exception;
	public void modificar(Raza raz) throws Exception;
	public void eliminar(Raza raz) throws Exception;

}
