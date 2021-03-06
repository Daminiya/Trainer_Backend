package com.sgic.hrm.commons.entity.par;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ReportParTraineeAppraisor", schema = "par")
public class ReportParTraineeAppraisor {
	
	@Id
	private String id;

	@ManyToOne()
	@JoinColumn(name = "par_id")
	private Par par;

	@ManyToOne()
	@JoinColumn(name = "parAppraisor_appraiserId")
	private ParAppraisor parAppraisor;

	public ReportParTraineeAppraisor(String id) {
		this.id = id;
	}

	public ReportParTraineeAppraisor() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Par getPar() {
		return par;
	}

	public void setPar(Par par) {
		this.par = par;
	}

	public ParAppraisor getParAppraisor() {
		return parAppraisor;
	}

	public void setParAppraisor(ParAppraisor parAppraisor) {
		this.parAppraisor = parAppraisor;
	}

}
