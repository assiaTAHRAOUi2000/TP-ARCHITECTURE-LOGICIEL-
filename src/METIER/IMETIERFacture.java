package METIER;

import DAO.IDAOFacture;

public interface IMETIERFacture {
     public double CalculerPrix();
     void setDao(IDAOFacture dao);//injecter une instance de DAO 
}
