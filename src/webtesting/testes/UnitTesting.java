package webtesting.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UnitTesting {
ValidationData validation;
@Before
public void init()
{
	validation=new ValidationData();
}
@Test
public void testNom()
{
	assertTrue(validation.verif_nc("Khalil lakhdhar"));	


}
@Test
public void testClass()
{
	assertTrue(validation.verifclass("LPG2"));


}

}
