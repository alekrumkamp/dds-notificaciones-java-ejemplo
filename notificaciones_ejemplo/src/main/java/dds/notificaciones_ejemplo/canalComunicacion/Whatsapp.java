package dds.notificaciones_ejemplo.canalComunicacion;

import dds.notificaciones_ejemplo.excepciones.InsuficientePrioridadExcepcion;
import dds.notificaciones_ejemplo.notificacion.NivelPrioridadNotificacion;
import dds.notificaciones_ejemplo.notificacion.Notificacion;

public class Whatsapp implements CanalComunicacion {
	private static Whatsapp whatsapp = new Whatsapp();
	
	private Whatsapp(){};
	
	public static Whatsapp obtenerInstancia(){
		return whatsapp;
	}
	public void enviar(Notificacion notificacion){
		if(notificacion.getNivelPrioridad() == NivelPrioridadNotificacion.BAJA)
			throw new InsuficientePrioridadExcepcion(); // O simplemente se podría poner un return; para ignorar la notificacion si no es lo suficientemente importante para mandarla por whatsapp
		
		// Acá podrían el método del servicio de correo que utilicen o bien tirar una excepción en caso de error
		String mensaje = "Enviando "
				.concat(notificacion.getMensaje())
				.concat(" al whatsapp: ")
				.concat(notificacion.getNumeroTelefono());
		System.out.println(mensaje);
	}
}
