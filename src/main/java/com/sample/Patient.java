package com.sample;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Patient {
	private List<Symptom> Symptons;
	private List<EEtiology> EtiologyFactors;
	
	// Drools
	private boolean Alucinacao = false;
	private boolean Delirio = false;
	private boolean DesorganizacaoPensamento = false;
	private boolean DesorganizacaoMotora = false;
	private boolean SintomasNegativos = false;
	private boolean Esquizofrenico = false;
	
	private double Esquizofrenia = 0;
	
	private boolean Candidato = false;
	private double PreMorbida = 0;
	private double Prodromica = 0;
	private double Aguda = 0;
	private double Cronica = 0;
	
	private String Fase = "";
	private boolean Remediar = false;
	private List<String> Recomendacoes; 
	
	
	public Patient() {
		Symptons = new ArrayList<Symptom>();
		EtiologyFactors = new ArrayList<EEtiology>();
		Recomendacoes = new ArrayList<String>();
	}
	
	public boolean hasSymptom(ESymptomType symptom) {
		for(Symptom s : Symptons) {			
			if(s.getSymptonType() == symptom) {
				return true;
			}
		}
		
		return false;
	}
	
	public List<Symptom> getSymptom(ESymptomType symptom) {
	
		List<Symptom> symptons = new ArrayList<Symptom>();
		
		for(Symptom s : Symptons) {			
			if(s.getSymptonType() == symptom) {
				symptons.add(s);
			}
		}
		
		return symptons;
	}
	
	public void addSymptom(Symptom symptom) {
		this.Symptons.add(symptom);
	}
	
	public int getMonthsOfSymptom(ESymptomType symptom) {
		List<Symptom> symptons = getSymptom(symptom);
		int months = 0;
		
		for(Symptom s : symptons) {			
			if(s.getMonths() > months) {
				months = s.getMonths();
			}
		}
		
		return months;
	}
	
	public void addEtiology(EEtiology e) {
		this.EtiologyFactors.add(e);
	}

	public boolean isAlucinacao() {
		return Alucinacao;
	}

	public void setAlucinacao(boolean alucinacao) {
		Alucinacao = alucinacao;
	}

	public boolean isDelirio() {
		return Delirio;
	}

	public void setDelirio(boolean delirio) {
		Delirio = delirio;
	}

	public boolean isDesorganizacaoPensamento() {
		return DesorganizacaoPensamento;
	}

	public void setDesorganizacaoPensamento(boolean desorganizacaoPensamento) {
		DesorganizacaoPensamento = desorganizacaoPensamento;
	}

	public boolean isDesorganizacaoMotora() {
		return DesorganizacaoMotora;
	}

	public void setDesorganizacaoMotora(boolean desorganizacaoMotora) {
		DesorganizacaoMotora = desorganizacaoMotora;
	}

	public boolean isSintomasNegativos() {
		return SintomasNegativos;
	}

	public void setSintomasNegativos(boolean sintomasNegativos) {
		SintomasNegativos = sintomasNegativos;
	}

	public boolean isEsquizofrenico() {
		return Esquizofrenico;
	}

	public void setEsquizofrenico(boolean esquizofrenico) {
		Esquizofrenico = esquizofrenico;
	}

	public double getEsquizofrenia() {
		return Esquizofrenia;
	}

	public void setEsquizofrenia(double esquizofrenia) {
		Esquizofrenia = esquizofrenia;
	}

	public boolean isCandidato() {
		return Candidato;
	}

	public void setCandidato(boolean candidato) {
		Candidato = candidato;
	}

	public List<Symptom> getSymptons() {
		return Symptons;
	}

	public void setSymptons(List<Symptom> symptons) {
		Symptons = symptons;
	}

	public List<EEtiology> getEtiologyFactors() {
		return EtiologyFactors;
	}

	public void setEtiologyFactors(List<EEtiology> etiologyFactors) {
		EtiologyFactors = etiologyFactors;
	}

	public double getPreMorbida() {
		return PreMorbida;
	}

	public void setPreMorbida(double preMorbida) {
		PreMorbida = preMorbida;
	}

	public double getProdromica() {
		return Prodromica;
	}

	public void setProdromica(double prodromica) {
		Prodromica = prodromica;
	}

	public double getAguda() {
		return Aguda;
	}

	public void setAguda(double aguda) {
		Aguda = aguda;
	}

	public double getCronica() {
		return Cronica;
	}

	public void setCronica(double cronica) {
		Cronica = cronica;
	}

	public String getFase() {
		return Fase;
	}

	public void setFase(String fase) {
		Fase = fase;
	}

	public boolean isRemediar() {
		return Remediar;
	}

	public void setRemediar(boolean remediar) {
		Remediar = remediar;
	}

	public List<String> getRecomendacoes() {
		return Recomendacoes;
	}

	public void setRecomendacoes(List<String> recomendacoes) {
		Recomendacoes = recomendacoes;
	}
}
