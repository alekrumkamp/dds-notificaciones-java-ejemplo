package dds.notificaciones_ejemplo.canalComunicacion;

import dds.notificaciones_ejemplo.notificacion.Notificacion;

public class Email implements CanalComunicacion {
	private static Email email = new Email();
	
	private Email(){};
	
	public static Email obtenerInstancia(){
		return email;
	}
	public void enviar(Notificacion notificacion){
		
		String mensaje = "Enviando "
				.concat(notificacion.getMensaje())
				.concat(" al email: ")
				.concat(notificacion.getEmail());
		System.out.println(mensaje);
	}
}
