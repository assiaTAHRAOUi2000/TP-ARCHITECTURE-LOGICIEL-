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
					//charger dynamiquement la classe en mémoire
					Class cDao = Class.forName(daoClassName);
					//instanciation de la classe chargée en mémoire 
					IDAOFacture dao = (IDAOFacture) cDao.newInstance();
					Class cMetier = Class.forName("METIER.METIERFacture");
					IMETIERFacture metier = (IMETIERFacture) cMetier.newInstance();
					metier.setDao(dao);
					System.out.println("le prix récupéré est : "+dao.getPrix());
					System.out.println("le prix calculé est : "+metier.CalculerPrix());
				}

}
