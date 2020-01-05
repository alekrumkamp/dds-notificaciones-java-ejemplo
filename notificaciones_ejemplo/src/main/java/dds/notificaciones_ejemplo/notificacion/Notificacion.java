package dds.notificaciones_ejemplo.notificacion;

public class Notificacion {
	private String email;
	private String mensaje;
	private NivelPrioridadNotificacion nivelPrioridadNotificacion;
	private String numeroTelefono;
	
	Notificacion(String unEmail,
			String unMensaje,
			NivelPrioridadNotificacion unNivelPrioridadNotificacion,
			String numeroTelefono){
		this.email = unEmail;
		this.mensaje = unMensaje;
		this.nivelPrioridadNotificacion = unNivelPrioridadNotificacion;
		this.numeroTelefono = numeroTelefono;
	}

	public String getMensaje(){
		return this.mensaje;
	}
	
	public String getNumeroTelefono(){
		return this.numeroTelefono;
	}
	
	public NivelPrioridadNotificacion getNivelPrioridad() {
		return this.nivelPrioridadNotificacion;
	}
	
	public String getEmail(){
		return this.email;
	}
}
