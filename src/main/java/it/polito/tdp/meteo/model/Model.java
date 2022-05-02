package it.polito.tdp.meteo.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import it.polito.tdp.meteo.DAO.MeteoDAO;

public class Model {
	
	private final static int COST = 100;
	private final static int NUMERO_GIORNI_CITTA_CONSECUTIVI_MIN = 3;
	private final static int NUMERO_GIORNI_CITTA_MAX = 6;
	private final static int NUMERO_GIORNI_TOTALI = 15;

	private MeteoDAO meteoDao;
	public Model() {
		meteoDao=new MeteoDAO();
	}

	// of course you can change the String output with what you think works best
	public String getUmiditaMedia(int mese) {
		String s="";
		List<Rilevamento> rilevamenti=new LinkedList<>();
		Float media=(float) 0;
		Integer cnt=0;
		
		rilevamenti.addAll(this.meteoDao.getAllRilevamentiLocalitaMese(mese, "Torino"));
		
		for(Rilevamento r:rilevamenti) {
			media+=r.getUmidita();
			cnt++;
		}
		media=media/cnt;
		s+="Torino: "+media+";\n";
		
		cnt=0; media=(float) 0;
		
		rilevamenti.addAll(this.meteoDao.getAllRilevamentiLocalitaMese(mese, "Milano"));
		
		for(Rilevamento r:rilevamenti) {
			media+=r.getUmidita();
			cnt++;
		}
		media=media/cnt;
		s+="Milano: "+media+";\n";
		
		cnt=0; media=(float) 0;
		
		rilevamenti.addAll(this.meteoDao.getAllRilevamentiLocalitaMese(mese, "Genova"));
		
		for(Rilevamento r:rilevamenti) {
			media+=r.getUmidita();
			cnt++;
		}
		media=media/cnt;
		s+="Genova: "+media+".\n";

		return s;
	}
	
	// of course you can change the String output with what you think works best
	public String trovaSequenza(int mese) {
		List<Rilevamento>rilevamenti=this.meteoDao.getAllRilevamentiLocalitaMese(mese, "Torino");
		
		return "TODO!";
	}
	
	private void ricorsiva(String parziale, int livello, String rimanenti) {
		if(rimanenti.length()==0) { //caso terminale
			
		}else { /*caso normale*/
			
			for(int pos=0;pos<rimanenti.length();pos++) { // sto creando i sottoproblemi
				
			}
		}
		
	}
	

}
