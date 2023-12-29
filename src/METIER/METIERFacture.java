package METIER;
import DAO.IDAOFacture;

public class METIERFacture implements IMETIERFacture {
    private IDAOFacture dao;
	@Override
	public double CalculerPrix() {
		double d=dao.getPrix();
		double prix = d*100;
		return prix;
	}
	public void setDao(IDAOFacture dao) {
		this.dao = dao;
	}
	
	public double getPrixCalcule() {
        return CalculerPrix();
    }
	
}
