package webtesting.fonction;

import webtesting.Enfant;
import webtesting.testes.ValidationData;

public class TestMain {
static String nom_complet="khalil lakhdhar";
static String classe="MD02";
static String login="admin";
static String mdp="orsys2021";
static boolean etat=true;
static String note_precedente="17";
static int id=1;
static String erreur="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enfant ef=new Enfant();
ValidationData validation = new ValidationData();
if((validation.verif_login(login)) && (validation.verif_mdp(mdp) ))
		{
	if(validation.verif_nc(nom_complet))
	{
		ef.setNom_complet(nom_complet);
	}
	else 
	{
	etat=false;
	erreur=erreur+" le nom est incorrecte";
	}
	if(validation.verifclass(classe))
	{
		ef.setClasse(classe);
	}
	else 
	{
	etat=false;
	erreur=erreur+" la classe est incorrecte";
	}
	try
	{
		double x=Double.parseDouble(note_precedente);
		if(x>0)
		{
			ef.setNote_precedente(x);
		}
		else
		{
			erreur=erreur+ " la note doit être >0";
			etat=false;
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("la note doit être numérique");
		etat=false;
	}
	
		}	
else 
{
System.out.println("vous n'êtes pas autorisé!");
etat=false;
}
if(etat)
{
	
	System.out.println("ajouté avec succés "+ ef.toString());
}
else
{
	System.out.println(erreur);
	
}
	
		
	}

}
