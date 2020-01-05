package dds.notificaciones_ejemplo;

import org.junit.Test;

import dds.notificaciones_ejemplo.canalComunicacion.Email;
import dds.notificaciones_ejemplo.canalComunicacion.Whatsapp;
import dds.notificaciones_ejemplo.notificacion.NivelPrioridadNotificacion;
import dds.notificaciones_ejemplo.notificacion.Notificacion;
import dds.notificaciones_ejemplo.notificacion.NotificacionBuilder;

public class AppTest {
	
	private Notificacion notificacionPrioridadMedio() {
		NotificacionBuilder notificacionBuilder = new NotificacionBuilder();
		Notificacion notificacion = notificacionBuilder
				.construirNotificacion("ejemplo@dds.dds",
						"¡Un mensaje de prueba!",
						NivelPrioridadNotificacion.MEDIA,
						"+5491144445555");
		return notificacion;
	}
	
	private Notificacion notificacionPrioridadBaja() {
		NotificacionBuilder notificacionBuilder = new NotificacionBuilder();
		Notificacion notificacion = notificacionBuilder
				.construirNotificacion("ejemplo@dds.dds",
						"¡Otro mensaje de prueba!",
						NivelPrioridadNotificacion.BAJA,
						"+5491144445555");
		return notificacion;
	}

	@Test
	public void enviarNotificacionEmailTest() {
		Email email = Email.obtenerInstancia();
	    email.enviar(notificacionPrioridadMedio());
	}
	
	@Test
	public void enviarNotificacionWhatsappTest() {
		Whatsapp whatsapp = Whatsapp.obtenerInstancia();
	    whatsapp.enviar(notificacionPrioridadMedio());
	} 
	
	@Test
	public void noEnviarNotificacionWhatsappTest() throws Exception {
		Whatsapp whatsapp = Whatsapp.obtenerInstancia();
	    try{
	    	whatsapp.enviar(notificacionPrioridadBaja());
	    	throw new Exception("No se deberian poder mandar notificaciones de prioridad baja viawhatsapp");
	    }catch (Exception e) {
	    	
	    }
	} 
}
