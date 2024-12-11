package registro;

import java.util.ArrayList;
import java.util.Scanner;

public class studenti
{
	/*
	 * Gestione di un Registro di Studenti Creare un programma Java che consenta di
	 * gestire un registro degli studenti. Il programma deve:
	 * 
	 * Registrare nuovi studenti con: Nome, Cognome, Matricola (univoca).
	 * Visualizzare l'elenco degli studenti. Cercare uno studente tramite la
	 * matricola. Requisiti Tecnici: Creare una classe Studente con i campi
	 * necessari. Utilizzare un ArrayList per memorizzare gli studenti. Creare un
	 * menu testuale che permetta all'utente di:
	 * 
	 * Aggiungere uno studente. Visualizzare tutti gli studenti. Cercare uno
	 * studente per matricola. Uscire dal programma
	 */

	private String nome;
	private String cognome;
	private String matricola;

	// costruttore per studente

	public studenti(String nome, String cognome, String matricola)
	{

		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;

	}

	public String getnome()
	{
		return nome;

	}

	public String getcognome()
	{
		return cognome;
	}

	public String matricola()
	{
		return matricola;
	}
	// ora utilizziamo un metodo per visualizzare le informazioni dello studente

	public void visualizzainformazioni()
	{
		System.out.println("Matricola: " + matricola, "Nome. " + nome, "Cognome" + cognome);
	}
	// ora facciamo un ArrayList per il registro studenti

	public class GestioneRegistroStudenti
	{
		private static ArrayList<String> studenti = new ArrayList<String>();
		private static Scanner scanner = new Scanner(System.in);
	}
	// metodo per aggiungere studenti

	public static void aggiungiStudente()
	{
		System.out.println("Aggiungi matricola: ");
		String matricola = Scanner.nextLine();

		System.out.println("Aggiungi nome: ");
		String nome = Scanner.nextLine();

		System.out.println("Aggiungi cognome: ");
		String cognome = Scanner.nextLine();

		// ora dobbiamo vedere se la matricola esiste

		for (Studente studente : studenti)
		{
			if (studente.getmatricola().equals(matricola))
			{
				System.out.println("errore, la matricola esiste già" + matricola);
				return;

			}

		} // ora dobbiamo aggiungere lo studente alla lista
		studenti.add(new Studente(nome, cognome, matricola));
		System.out.println("Studente aggiunto con successo.");
	}
	// ora abbiamo bisogno di visulizzare tutti gli studenti con quelli aggiunti

	public static void visualizzastudenti()
	{
		if (studenti == 0)
		{
			System.out.println("Non ci sono studenti");

		} else
		{
			System.out.println("/n studenti");
		}
		for (Studente studente : studenti)
		{
			studente.visualizzainformazioni();
		}
	}// ora che possiamo visualizzarli tutti dobbiamo creare un metodo che ci faccia
		// cercare il singolo studente dalla matricola

	public static void matricolastudente()
	{
		System.out.println("inserisci numero matricola");
		String matricola = Scanner.nextLine();
		for (Studente studente : studenti)
		{
			if (studente.getmatricola().equals(matricola))
			{
				String visualizzainformazioni = Scanner.nextLine();
			} else
			{
				System.out.println("codice matricola non trivato");
			}
		}

	} // ora dobbiamo creare un metodo Menu che ci dia la possibilità di gestire tutte
		// le operazioni

	public static void Menu()
	{

		while (true)
		{
			System.out.println("Menu");
			System.out.println("aggiunngi studente");
			System.out.println("visualizza tutti gli studenti");
			System.out.println("cerca la matricola");
			System.out.println(" esci");
			System.out.println("seleziona una opzione: ");
			int scelta = scanner.nextInt();
			scanner.nextLine();
			switch (scelta)
			{
			case 1:
				aggiungiStudente();
				break;
			case 2:
				visualizzastudenti();
				break;
			case 3:
				matricolastudente();
				break;
			case 4:
				System.out.println("Uscita dal programma.");
				return;
			default:
				System.out.println("Opzione non valida. Riprova.");
			}
		}

	}

	public static void main(String[] args)
	{
		Menu();
	}

}
