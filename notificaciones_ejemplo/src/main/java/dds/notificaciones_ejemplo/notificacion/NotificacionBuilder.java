package dds.notificaciones_ejemplo.notificacion;

import javax.management.RuntimeErrorException;

import dds.notificaciones_ejemplo.excepciones.CamposRequeridosFaltantesExcepcion;

public class NotificacionBuilder {
		
		public Notificacion construirNotificacion(String unEmail,
				String unMensaje,
				NivelPrioridadNotificacion unNivelPrioridadNotificacion,
				String unNumeroTelefono) {
			
			if(unEmail == null && unNumeroTelefono == null) {
				throw new RuntimeErrorException(new CamposRequeridosFaltantesExcepcion());
			}
			
			return new Notificacion(unEmail,
					unMensaje,
					unNivelPrioridadNotificacion,
					unNumeroTelefono);
		}
}
