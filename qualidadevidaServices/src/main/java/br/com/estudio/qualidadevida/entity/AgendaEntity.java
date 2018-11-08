package br.com.estudio.qualidadevida.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Agenda")
@NamedQueries(value = {
		@NamedQuery(name = AgendaEntity.OBTER_AULAS_DADAS, 
				query =  " SELECT a.dataAula, a.horaInicio, count(*)"
						+ "  FROM AgendaEntity a "
				        +"       ,AgendaAlunoEntity aa"
						+"  WHERE a.id = aa.agendaId"
				        +"   AND  aa.statusAula = 'D'"
						+"  GROUP BY a.dataAula, a.horaInicio")})
public class AgendaEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String OBTER_AULAS_DADAS = "AgendaEntity.obter_renda_mensal";
	
	public AgendaEntity() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_agenda")
	private Integer agendaId;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_aula")
	private Date dataAula;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "hora_inicio")
	private Date horaInicio;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "hora_fim")
	private Date horaFim;
	
	@OneToMany(mappedBy = "agenda", targetEntity = AgendaAlunoEntity.class, fetch = FetchType.LAZY)
	private Set<AgendaAlunoEntity> agendaAlunos;

	/**
	 * @return the id
	 */
	public Integer getAgendaId() {
		return agendaId;
	}

	/**
	 * @param agendaId the id to set
	 */
	public void setAgendaId(Integer agendaId) {
		this.agendaId = agendaId;
	}

	/**
	 * @return the dataAula
	 */
	public Date getDataAula() {
		return dataAula;
	}

	/**
	 * @param dataAula the dataAula to set
	 */
	public void setDataAula(Date dataAula) {
		this.dataAula = dataAula;
	}

	/**
	 * @return the horaInicio
	 */
	public Date getHoraInicio() {
		return horaInicio;
	}

	/**
	 * @param horaInicio the horaInicio to set
	 */
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	/**
	 * @return the horaFim
	 */
	public Date getHoraFim() {
		return horaFim;
	}

	/**
	 * @param horaFim the horaFim to set
	 */
	public void setHoraFim(Date horaFim) {
		this.horaFim = horaFim;
	}

	/**
	 * @return the agendaAlunos
	 */
	public Set<AgendaAlunoEntity> getAgendaAlunos() {
		return agendaAlunos;
	}

	/**
	 * @param agendaAlunos the agendaAlunos to set
	 */
	public void setAgendaAlunos(Set<AgendaAlunoEntity> agendaAlunos) {
		this.agendaAlunos = agendaAlunos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agendaId == null) ? 0 : agendaId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgendaEntity other = (AgendaEntity) obj;
		if (agendaId == null) {
			if (other.agendaId != null)
				return false;
		} else if (!agendaId.equals(other.agendaId))
			return false;
		return true;
	}
	
	

}
