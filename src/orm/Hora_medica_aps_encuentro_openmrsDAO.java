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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Hora_medica_aps_encuentro_openmrsDAO {
	public static Hora_medica_aps_encuentro_openmrs loadHora_medica_aps_encuentro_openmrsByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return loadHora_medica_aps_encuentro_openmrsByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs getHora_medica_aps_encuentro_openmrsByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return getHora_medica_aps_encuentro_openmrsByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs loadHora_medica_aps_encuentro_openmrsByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return loadHora_medica_aps_encuentro_openmrsByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs getHora_medica_aps_encuentro_openmrsByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return getHora_medica_aps_encuentro_openmrsByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs loadHora_medica_aps_encuentro_openmrsByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Hora_medica_aps_encuentro_openmrs) session.load(orm.Hora_medica_aps_encuentro_openmrs.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs getHora_medica_aps_encuentro_openmrsByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Hora_medica_aps_encuentro_openmrs) session.get(orm.Hora_medica_aps_encuentro_openmrs.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs loadHora_medica_aps_encuentro_openmrsByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hora_medica_aps_encuentro_openmrs) session.load(orm.Hora_medica_aps_encuentro_openmrs.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs getHora_medica_aps_encuentro_openmrsByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hora_medica_aps_encuentro_openmrs) session.get(orm.Hora_medica_aps_encuentro_openmrs.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora_medica_aps_encuentro_openmrs(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return queryHora_medica_aps_encuentro_openmrs(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora_medica_aps_encuentro_openmrs(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return queryHora_medica_aps_encuentro_openmrs(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs[] listHora_medica_aps_encuentro_openmrsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return listHora_medica_aps_encuentro_openmrsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs[] listHora_medica_aps_encuentro_openmrsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return listHora_medica_aps_encuentro_openmrsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora_medica_aps_encuentro_openmrs(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hora_medica_aps_encuentro_openmrs as Hora_medica_aps_encuentro_openmrs");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora_medica_aps_encuentro_openmrs(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hora_medica_aps_encuentro_openmrs as Hora_medica_aps_encuentro_openmrs");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hora_medica_aps_encuentro_openmrs", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs[] listHora_medica_aps_encuentro_openmrsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHora_medica_aps_encuentro_openmrs(session, condition, orderBy);
			return (Hora_medica_aps_encuentro_openmrs[]) list.toArray(new Hora_medica_aps_encuentro_openmrs[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs[] listHora_medica_aps_encuentro_openmrsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHora_medica_aps_encuentro_openmrs(session, condition, orderBy, lockMode);
			return (Hora_medica_aps_encuentro_openmrs[]) list.toArray(new Hora_medica_aps_encuentro_openmrs[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs loadHora_medica_aps_encuentro_openmrsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return loadHora_medica_aps_encuentro_openmrsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs loadHora_medica_aps_encuentro_openmrsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return loadHora_medica_aps_encuentro_openmrsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs loadHora_medica_aps_encuentro_openmrsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hora_medica_aps_encuentro_openmrs[] hora_medica_aps_encuentro_openmrses = listHora_medica_aps_encuentro_openmrsByQuery(session, condition, orderBy);
		if (hora_medica_aps_encuentro_openmrses != null && hora_medica_aps_encuentro_openmrses.length > 0)
			return hora_medica_aps_encuentro_openmrses[0];
		else
			return null;
	}
	
	public static Hora_medica_aps_encuentro_openmrs loadHora_medica_aps_encuentro_openmrsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hora_medica_aps_encuentro_openmrs[] hora_medica_aps_encuentro_openmrses = listHora_medica_aps_encuentro_openmrsByQuery(session, condition, orderBy, lockMode);
		if (hora_medica_aps_encuentro_openmrses != null && hora_medica_aps_encuentro_openmrses.length > 0)
			return hora_medica_aps_encuentro_openmrses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHora_medica_aps_encuentro_openmrsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return iterateHora_medica_aps_encuentro_openmrsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHora_medica_aps_encuentro_openmrsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Hospitaldb2PersistentManager.instance().getSession();
			return iterateHora_medica_aps_encuentro_openmrsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHora_medica_aps_encuentro_openmrsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hora_medica_aps_encuentro_openmrs as Hora_medica_aps_encuentro_openmrs");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHora_medica_aps_encuentro_openmrsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hora_medica_aps_encuentro_openmrs as Hora_medica_aps_encuentro_openmrs");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hora_medica_aps_encuentro_openmrs", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs createHora_medica_aps_encuentro_openmrs() {
		return new orm.Hora_medica_aps_encuentro_openmrs();
	}
	
	public static boolean save(orm.Hora_medica_aps_encuentro_openmrs hora_medica_aps_encuentro_openmrs) throws PersistentException {
		try {
			orm.Hospitaldb2PersistentManager.instance().saveObject(hora_medica_aps_encuentro_openmrs);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Hora_medica_aps_encuentro_openmrs hora_medica_aps_encuentro_openmrs) throws PersistentException {
		try {
			orm.Hospitaldb2PersistentManager.instance().deleteObject(hora_medica_aps_encuentro_openmrs);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Hora_medica_aps_encuentro_openmrs hora_medica_aps_encuentro_openmrs)throws PersistentException {
		try {
			if(hora_medica_aps_encuentro_openmrs.getHora_medica() != null) {
				hora_medica_aps_encuentro_openmrs.getHora_medica().setHora_medica_aps_encuentro_openmrs(null);
			}
			
			return delete(hora_medica_aps_encuentro_openmrs);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Hora_medica_aps_encuentro_openmrs hora_medica_aps_encuentro_openmrs, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(hora_medica_aps_encuentro_openmrs.getHora_medica() != null) {
				hora_medica_aps_encuentro_openmrs.getHora_medica().setHora_medica_aps_encuentro_openmrs(null);
			}
			
			try {
				session.delete(hora_medica_aps_encuentro_openmrs);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Hora_medica_aps_encuentro_openmrs hora_medica_aps_encuentro_openmrs) throws PersistentException {
		try {
			orm.Hospitaldb2PersistentManager.instance().getSession().refresh(hora_medica_aps_encuentro_openmrs);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Hora_medica_aps_encuentro_openmrs hora_medica_aps_encuentro_openmrs) throws PersistentException {
		try {
			orm.Hospitaldb2PersistentManager.instance().getSession().evict(hora_medica_aps_encuentro_openmrs);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica_aps_encuentro_openmrs loadHora_medica_aps_encuentro_openmrsByCriteria(Hora_medica_aps_encuentro_openmrsCriteria hora_medica_aps_encuentro_openmrsCriteria) {
		Hora_medica_aps_encuentro_openmrs[] hora_medica_aps_encuentro_openmrses = listHora_medica_aps_encuentro_openmrsByCriteria(hora_medica_aps_encuentro_openmrsCriteria);
		if(hora_medica_aps_encuentro_openmrses == null || hora_medica_aps_encuentro_openmrses.length == 0) {
			return null;
		}
		return hora_medica_aps_encuentro_openmrses[0];
	}
	
	public static Hora_medica_aps_encuentro_openmrs[] listHora_medica_aps_encuentro_openmrsByCriteria(Hora_medica_aps_encuentro_openmrsCriteria hora_medica_aps_encuentro_openmrsCriteria) {
		return hora_medica_aps_encuentro_openmrsCriteria.listHora_medica_aps_encuentro_openmrs();
	}
}