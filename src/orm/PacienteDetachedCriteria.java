/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PacienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression reserva;
	public final IntegerExpression paciente_openmrsId;
	public final AssociationExpression paciente_openmrs;
	
	public PacienteDetachedCriteria() {
		super(orm.Paciente.class, orm.PacienteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		reserva = new CollectionExpression("ORM_reserva", this.getDetachedCriteria());
		paciente_openmrsId = new IntegerExpression("paciente_openmrs.id", this.getDetachedCriteria());
		paciente_openmrs = new AssociationExpression("paciente_openmrs", this.getDetachedCriteria());
	}
	
	public PacienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PacienteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		reserva = new CollectionExpression("ORM_reserva", this.getDetachedCriteria());
		paciente_openmrsId = new IntegerExpression("paciente_openmrs.id", this.getDetachedCriteria());
		paciente_openmrs = new AssociationExpression("paciente_openmrs", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public ReservaDetachedCriteria createReservaCriteria() {
		return new ReservaDetachedCriteria(createCriteria("ORM_reserva"));
	}
	
	public Paciente_openmrsDetachedCriteria createPaciente_openmrsCriteria() {
		return new Paciente_openmrsDetachedCriteria(createCriteria("paciente_openmrs"));
	}
	
	public Paciente uniquePaciente(PersistentSession session) {
		return (Paciente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Paciente[] listPaciente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Paciente[]) list.toArray(new Paciente[list.size()]);
	}
}

