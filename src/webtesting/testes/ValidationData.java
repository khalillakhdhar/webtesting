package webtesting.testes;

public class ValidationData {
public boolean verif_nc(String nom)
{
	return nom.contains(" ");
	

}
public boolean verifclass(String classe)
{
	if(classe.length()!=4)
		return false;
	else 
		return true;


}
public double verif_note(String note)
{
	return Double.parseDouble(note);
	

}
public boolean verif_login(String login)
{
	return login.equals("admin");
	

}
}
