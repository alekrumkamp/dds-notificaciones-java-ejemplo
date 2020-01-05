package dds.notificaciones_ejemplo.canalComunicacion;

import dds.notificaciones_ejemplo.notificacion.Notificacion;

public interface CanalComunicacion {
	void enviar(Notificacion notificacion);
}
