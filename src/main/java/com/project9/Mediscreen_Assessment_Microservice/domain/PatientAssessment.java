package com.project9.Mediscreen_Assessment_Microservice.domain;

import java.util.List;

import com.project9.Mediscreen_Note_Microservice.domain.Note;
import com.project9.Mediscreen_Patient_Microservice.domain.Patient;

public class PatientAssessment {

	private Patient patientBean;
	private List<Note> listOfNotesBean;

	public Patient getPatientBean() {
		return patientBean;
	}

	public void setPatientBean(Patient patientBean) {
		this.patientBean = patientBean;
	}

	public List<Note> getListOfNotesBean() {
		return listOfNotesBean;
	}

	public void setListOfNotesBean(List<Note> listOfNotesBean) {
		this.listOfNotesBean = listOfNotesBean;
	}

	public PatientAssessment() {
		super();
	}

	public PatientAssessment(Patient patientBean, List<Note> listOfNotesBean) {
		super();
		this.patientBean = patientBean;
		this.listOfNotesBean = listOfNotesBean;
	}
}
