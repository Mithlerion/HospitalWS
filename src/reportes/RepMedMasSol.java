package reportes;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


//import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
//import org.hibernate.criterion.Projection;
//import org.hibernate.criterion.Projections;
//import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;

import orm.Hora_medicaCriteria;
import orm.MedicoCriteria;
import orm.ReservaCriteria;
import vo.MedicoVo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 * Clase RepMedMasSol Reporte del M�dico mas solicitado con su lista de horas.
 * Extiende de Reporte.
 * 
 *
 */
public class RepMedMasSol extends Reporte {
	/* +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ */
	final class MedReservas implements Comparable<MedReservas> {
		private int reservas;
		private MedicoVo medico;

		public MedReservas(int reservas, MedicoVo medico) {
			this.reservas = reservas;
			this.medico = medico;
		}

		public MedicoVo getMedico() {
			return this.medico;
		}

		public int getReservas() {
			return this.reservas;
		}

		public int compareTo(MedReservas other) {
			// retornar < 0 si este es menor que other
			// 0 si igual o > 0 i mayor que otro.
			return this.reservas - other.reservas;
		}

	}

	/* +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ */

	/**
	 * getReport Obtiene un reporte de reservas entre dos fechas dadas.
	 * @param Dafe t1 y Date t2
	 * @return String lista de reservas y sus M�dicos ordenadas de mayor a menor.
	 */
	public String getReport(Date t1, Date t2) {
		// Gson g = new Gson();
		Gson g = new GsonBuilder().setPrettyPrinting().create();

		try {
			// Traer medicos que han reservado ordenados por id.
			MedicoCriteria mc = new MedicoCriteria();
			Hora_medicaCriteria hmc = mc.createHora_medicaCriteria();
			hmc.f_inicio.between(new Timestamp(t1.getTime()),
					new Timestamp(t2.getTime()));
			ReservaCriteria rc = hmc.createReservaCriteria();
			rc.hora_medica.isNotEmpty();
			mc.addOrder(Order.asc("id"));

			@SuppressWarnings("unchecked")
			List<orm.Medico> medicos = mc.list();
			List<MedReservas> lMedRes = new ArrayList<MedReservas>();

			orm.Hora_medica hm = orm.Hora_medicaDAO.getHora_medicaByORMID(1);
			orm.Reserva re = orm.ReservaDAO.getReservaByORMID(1);
			re.hora_medica.add(hm);
			orm.ReservaDAO.save(re);

			// Cuenta de la cantidad de reservas de cada paciente y las asocia a
			// este.
			int count = 0;
			int current_id = 0;

			if (medicos.size() > 0) { // Si existen M�dicos con Reservas.

				current_id = medicos.get(0).getId(); // El id actual es el del
														// primer medico;
				for (int i = 0; i < medicos.size(); i++) {

					if (medicos.get(i).getId() != current_id
							|| i == medicos.size() - 1) { // Sigo contando a
															// menos que el id
															// cambie.
						if (i == medicos.size() - 1) { // Si agregamos el �ltimo
														// M�dico debemos
														// incrementar
							count++; // en 1+ la cuenta.
						}
						//Creo un objeto MedReservas para convertirlo a JSON luego
						MedicoVo med = MedicoVo.fromORM(medicos.get(i - 1)); 	
						int porcentaje = (int) (count * 100) / medicos.size();
						lMedRes.add(new MedReservas(porcentaje, med));
						count = 1; // Reseteo el contador a para el id
									// siguiente.
						current_id = medicos.get(i).getId();
					} else {
						count++;
					}
				}
			}

			// Ordenar por cantidad de reservas
			Collections.sort(lMedRes);
			// invertir orden de mayor a menor
			Collections.reverse(lMedRes);

			return g.toJson(lMedRes);

		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;

	}
}
