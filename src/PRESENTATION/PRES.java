package PRESENTATION;
import java.io.File;
import java.util.Scanner;

import DAO.IDAOFacture;
import METIER.IMETIERFacture;
public class PRES {
	public static void main(String[] args) throws Exception  {
					//Lecture du fichier de configuration 
					Scanner scanner = new Scanner(new File("config.txt"));
					//lire la premiere ligne du fichier 
					String daoClassName= scanner.nextLine();
					//System.out.println(daoClassName); 
					//charger dynamiquement la classe en m�moire
					Class cDao = Class.forName(daoClassName);
					//instanciation de la classe charg�e en m�moire 
					IDAOFacture dao = (IDAOFacture) cDao.newInstance();
					Class cMetier = Class.forName("METIER.METIERFacture");
					IMETIERFacture metier = (IMETIERFacture) cMetier.newInstance();
					metier.setDao(dao);
					System.out.println("le prix r�cup�r� est : "+dao.getPrix());
					System.out.println("le prix calcul� est : "+metier.CalculerPrix());
				}

}
