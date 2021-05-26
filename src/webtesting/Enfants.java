package webtesting;

import java.util.ArrayList;

public class Enfants {
static ArrayList<Enfant> listEnfant=new ArrayList<Enfant>();
void add(Enfant enf)
{
listEnfant.add(enf);	

}
public static ArrayList<Enfant> getListEnfant() {
	return listEnfant;
}
public static void setListEnfant(ArrayList<Enfant> listEnfant) {
	Enfants.listEnfant = listEnfant;
}






}
