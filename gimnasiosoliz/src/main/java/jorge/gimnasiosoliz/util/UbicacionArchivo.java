package jorge.gimnasiosoliz.util;


//Clase para guardar-leer los reportes, efectos sonidos, fotos de los socios.
public class UbicacionArchivo {
	private static String pathReportesJasper = "/Users/jorgeortiz/MEGA/GIMNASIOSOLIZ/reportes/";
	private static String pathDescargaReportes = "/Users/jorgeortiz/MEGA/GIMNASIOSOLIZ/reportes/";
	private static String pathCopiaSeguridadDatos = "/Users/jorgeortiz/MEGA/GIMNASIOSOLIZ/reportes/";
	private static String pathSonidoOk = "/Users/jorgeortiz/MEGA/GIMNASIOSOLIZ/EfectoSonido/Ok/";
	private static String pathSonidoError = "/Users/jorgeortiz/MEGA/GIMNASIOSOLIZ/EfectoSonido/Error/";
	private static String pathOrigenFotos = "/Users/jorgeortiz/MEGA/GIMNASIOSOLIZ/fotosSocios/";
	
	public static String getPathSonidoOk() {
		return pathSonidoOk;
	}
	public static void setPathSonidoOk(String pathSonidoOk) {
		UbicacionArchivo.pathSonidoOk = pathSonidoOk;
	}
	public static String getPathSonidoError() {
		return pathSonidoError;
	}
	public static void setPathSonidoError(String pathSonidoError) {
		UbicacionArchivo.pathSonidoError = pathSonidoError;
	}
	public static String getPathOrigenFotos() {
		return pathOrigenFotos;
	}
	public static void setPathOrigenFotos(String pathOrigenFotos) {
		UbicacionArchivo.pathOrigenFotos = pathOrigenFotos;
	}
	public static String getPathDescargaReportes() {
		return pathDescargaReportes;
	}
	public static void setPathDescargaReportes(String pathDescargaReportes) {
		UbicacionArchivo.pathDescargaReportes = pathDescargaReportes;
	}
	public static String getPathCopiaSeguridadDatos() {
		return pathCopiaSeguridadDatos;
	}
	public static void setPathCopiaSeguridadDatos(String pathCopiaSeguridadDatos) {
		UbicacionArchivo.pathCopiaSeguridadDatos = pathCopiaSeguridadDatos;
	}
	public static String getPathReportesJasper() {
		return pathReportesJasper;
	}
	public static void setPathReportesJasper(String pathReportesJasper) {
		UbicacionArchivo.pathReportesJasper = pathReportesJasper;
	}

	
	
	
}
