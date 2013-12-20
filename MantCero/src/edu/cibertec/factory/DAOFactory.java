package edu.cibertec.factory;



import edu.cibertec.service.AlumnoService;
import edu.cibertec.service.EspecialidadService;
import edu.cibertec.service.NivelService;
import edu.cibertec.service.UsuarioService;

public abstract class DAOFactory {
	public static final int MYSQL=1;
	public static final int JPA=2;
	public abstract UsuarioService getUsuarioService();
	public abstract NivelService getNivelService();
	public abstract AlumnoService getAlumnoService();
	public abstract EspecialidadService getEspecialidadService();
	public static DAOFactory getFactory(int bd){
		switch (bd) {
		case 1:
			return new MysqlDAOFactory();			
		}
		return null;
	}
//	public AlumnoService getAlumnoService() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public EspecialidadService getEspecialidadService() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
