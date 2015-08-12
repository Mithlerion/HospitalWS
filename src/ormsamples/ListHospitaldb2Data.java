/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListHospitaldb2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Persona...");
		orm.Persona[] ormPersonas = orm.PersonaDAO.listPersonaByQuery(null, null);
		int length = Math.min(ormPersonas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paciente...");
		orm.Paciente[] ormPacientes = orm.PacienteDAO.listPacienteByQuery(null, null);
		length = Math.min(ormPacientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPacientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Director...");
		orm.Director[] ormDirectors = orm.DirectorDAO.listDirectorByQuery(null, null);
		length = Math.min(ormDirectors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormDirectors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Medico...");
		orm.Medico[] ormMedicos = orm.MedicoDAO.listMedicoByQuery(null, null);
		length = Math.min(ormMedicos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMedicos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Especialidad...");
		orm.Especialidad[] ormEspecialidads = orm.EspecialidadDAO.listEspecialidadByQuery(null, null);
		length = Math.min(ormEspecialidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEspecialidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Reserva...");
		orm.Reserva[] ormReservas = orm.ReservaDAO.listReservaByQuery(null, null);
		length = Math.min(ormReservas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormReservas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hora_medica...");
		orm.Hora_medica[] ormHora_medicas = orm.Hora_medicaDAO.listHora_medicaByQuery(null, null);
		length = Math.min(ormHora_medicas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormHora_medicas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Box...");
		orm.Box[] ormBoxs = orm.BoxDAO.listBoxByQuery(null, null);
		length = Math.min(ormBoxs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormBoxs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paciente_openmrs...");
		orm.Paciente_openmrs[] ormPaciente_openmrses = orm.Paciente_openmrsDAO.listPaciente_openmrsByQuery(null, null);
		length = Math.min(ormPaciente_openmrses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPaciente_openmrses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hora_medica_aps_encuentro_openmrs...");
		orm.Hora_medica_aps_encuentro_openmrs[] ormHora_medica_aps_encuentro_openmrses = orm.Hora_medica_aps_encuentro_openmrsDAO.listHora_medica_aps_encuentro_openmrsByQuery(null, null);
		length = Math.min(ormHora_medica_aps_encuentro_openmrses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormHora_medica_aps_encuentro_openmrses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hora_medica_visita_openmrs...");
		orm.Hora_medica_visita_openmrs[] ormHora_medica_visita_openmrses = orm.Hora_medica_visita_openmrsDAO.listHora_medica_visita_openmrsByQuery(null, null);
		length = Math.min(ormHora_medica_visita_openmrses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormHora_medica_visita_openmrses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Proveedor_openmrs...");
		orm.Proveedor_openmrs[] ormProveedor_openmrses = orm.Proveedor_openmrsDAO.listProveedor_openmrsByQuery(null, null);
		length = Math.min(ormProveedor_openmrses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormProveedor_openmrses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Persona by Criteria...");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersonaCriteria.id.eq();
		lormPersonaCriteria.setMaxResults(ROW_COUNT);
		orm.Persona[] ormPersonas = lormPersonaCriteria.listPersona();
		int length =ormPersonas== null ? 0 : Math.min(ormPersonas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " Persona record(s) retrieved."); 
		
		System.out.println("Listing Paciente by Criteria...");
		orm.PacienteCriteria lormPacienteCriteria = new orm.PacienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPacienteCriteria.id.eq();
		lormPacienteCriteria.setMaxResults(ROW_COUNT);
		orm.Paciente[] ormPacientes = lormPacienteCriteria.listPaciente();
		length =ormPacientes== null ? 0 : Math.min(ormPacientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPacientes[i]);
		}
		System.out.println(length + " Paciente record(s) retrieved."); 
		
		System.out.println("Listing Director by Criteria...");
		orm.DirectorCriteria lormDirectorCriteria = new orm.DirectorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormDirectorCriteria.id.eq();
		lormDirectorCriteria.setMaxResults(ROW_COUNT);
		orm.Director[] ormDirectors = lormDirectorCriteria.listDirector();
		length =ormDirectors== null ? 0 : Math.min(ormDirectors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormDirectors[i]);
		}
		System.out.println(length + " Director record(s) retrieved."); 
		
		System.out.println("Listing Medico by Criteria...");
		orm.MedicoCriteria lormMedicoCriteria = new orm.MedicoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormMedicoCriteria.id.eq();
		lormMedicoCriteria.setMaxResults(ROW_COUNT);
		orm.Medico[] ormMedicos = lormMedicoCriteria.listMedico();
		length =ormMedicos== null ? 0 : Math.min(ormMedicos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormMedicos[i]);
		}
		System.out.println(length + " Medico record(s) retrieved."); 
		
		System.out.println("Listing Especialidad by Criteria...");
		orm.EspecialidadCriteria lormEspecialidadCriteria = new orm.EspecialidadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEspecialidadCriteria.id.eq();
		lormEspecialidadCriteria.setMaxResults(ROW_COUNT);
		orm.Especialidad[] ormEspecialidads = lormEspecialidadCriteria.listEspecialidad();
		length =ormEspecialidads== null ? 0 : Math.min(ormEspecialidads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEspecialidads[i]);
		}
		System.out.println(length + " Especialidad record(s) retrieved."); 
		
		System.out.println("Listing Reserva by Criteria...");
		orm.ReservaCriteria lormReservaCriteria = new orm.ReservaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormReservaCriteria.id.eq();
		lormReservaCriteria.setMaxResults(ROW_COUNT);
		orm.Reserva[] ormReservas = lormReservaCriteria.listReserva();
		length =ormReservas== null ? 0 : Math.min(ormReservas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormReservas[i]);
		}
		System.out.println(length + " Reserva record(s) retrieved."); 
		
		System.out.println("Listing Hora_medica by Criteria...");
		orm.Hora_medicaCriteria lormHora_medicaCriteria = new orm.Hora_medicaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormHora_medicaCriteria.id.eq();
		lormHora_medicaCriteria.setMaxResults(ROW_COUNT);
		orm.Hora_medica[] ormHora_medicas = lormHora_medicaCriteria.listHora_medica();
		length =ormHora_medicas== null ? 0 : Math.min(ormHora_medicas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormHora_medicas[i]);
		}
		System.out.println(length + " Hora_medica record(s) retrieved."); 
		
		System.out.println("Listing Box by Criteria...");
		orm.BoxCriteria lormBoxCriteria = new orm.BoxCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormBoxCriteria.id.eq();
		lormBoxCriteria.setMaxResults(ROW_COUNT);
		orm.Box[] ormBoxs = lormBoxCriteria.listBox();
		length =ormBoxs== null ? 0 : Math.min(ormBoxs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormBoxs[i]);
		}
		System.out.println(length + " Box record(s) retrieved."); 
		
		System.out.println("Listing Paciente_openmrs by Criteria...");
		orm.Paciente_openmrsCriteria lormPaciente_openmrsCriteria = new orm.Paciente_openmrsCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPaciente_openmrsCriteria.id.eq();
		lormPaciente_openmrsCriteria.setMaxResults(ROW_COUNT);
		orm.Paciente_openmrs[] ormPaciente_openmrses = lormPaciente_openmrsCriteria.listPaciente_openmrs();
		length =ormPaciente_openmrses== null ? 0 : Math.min(ormPaciente_openmrses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPaciente_openmrses[i]);
		}
		System.out.println(length + " Paciente_openmrs record(s) retrieved."); 
		
		System.out.println("Listing Hora_medica_aps_encuentro_openmrs by Criteria...");
		orm.Hora_medica_aps_encuentro_openmrsCriteria lormHora_medica_aps_encuentro_openmrsCriteria = new orm.Hora_medica_aps_encuentro_openmrsCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormHora_medica_aps_encuentro_openmrsCriteria.id.eq();
		lormHora_medica_aps_encuentro_openmrsCriteria.setMaxResults(ROW_COUNT);
		orm.Hora_medica_aps_encuentro_openmrs[] ormHora_medica_aps_encuentro_openmrses = lormHora_medica_aps_encuentro_openmrsCriteria.listHora_medica_aps_encuentro_openmrs();
		length =ormHora_medica_aps_encuentro_openmrses== null ? 0 : Math.min(ormHora_medica_aps_encuentro_openmrses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormHora_medica_aps_encuentro_openmrses[i]);
		}
		System.out.println(length + " Hora_medica_aps_encuentro_openmrs record(s) retrieved."); 
		
		System.out.println("Listing Hora_medica_visita_openmrs by Criteria...");
		orm.Hora_medica_visita_openmrsCriteria lormHora_medica_visita_openmrsCriteria = new orm.Hora_medica_visita_openmrsCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormHora_medica_visita_openmrsCriteria.id.eq();
		lormHora_medica_visita_openmrsCriteria.setMaxResults(ROW_COUNT);
		orm.Hora_medica_visita_openmrs[] ormHora_medica_visita_openmrses = lormHora_medica_visita_openmrsCriteria.listHora_medica_visita_openmrs();
		length =ormHora_medica_visita_openmrses== null ? 0 : Math.min(ormHora_medica_visita_openmrses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormHora_medica_visita_openmrses[i]);
		}
		System.out.println(length + " Hora_medica_visita_openmrs record(s) retrieved."); 
		
		System.out.println("Listing Proveedor_openmrs by Criteria...");
		orm.Proveedor_openmrsCriteria lormProveedor_openmrsCriteria = new orm.Proveedor_openmrsCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormProveedor_openmrsCriteria.id.eq();
		lormProveedor_openmrsCriteria.setMaxResults(ROW_COUNT);
		orm.Proveedor_openmrs[] ormProveedor_openmrses = lormProveedor_openmrsCriteria.listProveedor_openmrs();
		length =ormProveedor_openmrses== null ? 0 : Math.min(ormProveedor_openmrses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormProveedor_openmrses[i]);
		}
		System.out.println(length + " Proveedor_openmrs record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListHospitaldb2Data listHospitaldb2Data = new ListHospitaldb2Data();
			try {
				listHospitaldb2Data.listTestData();
				//listHospitaldb2Data.listByCriteria();
			}
			finally {
				orm.Hospitaldb2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
