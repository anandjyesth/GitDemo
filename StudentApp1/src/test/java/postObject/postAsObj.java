package postObject;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pojojsonObj.GlossDef;
import pojojsonObj.GlossEntry;
import pojojsonObj.Glossdiv;
import pojojsonObj.glossary;

public class postAsObj {
	
	@Test
	public void postobject() {
		
		List lst = new ArrayList();
		lst.add("GML");
		lst.add("XML");
		
		glossary gloss = new glossary();
		GlossEntry glossEntry = new GlossEntry();
		GlossDef glossDef = new GlossDef();
		Glossdiv glossdiv = new Glossdiv();
		
		
		//Set glossary
		gloss.setTitle("example glossary");
		glossEntry.setAbbrev("ISO 8879:1986");
		glossEntry.setAcronym("SGML");
		glossEntry.setGlossSee("MARKUP");
		glossEntry.setGlossTerm("STANDARDIZED GENERAL MARKUP Language");
		
		//set Glossdiv
		
		glossdiv.setTitle("s");
		
		//Set glossEntrty
		glossEntry.setSortAs("SGML");
		
		//Set glossDef
		glossDef.setPara("A markup meta language");
		glossDef.setGlossSeeAlso(lst);
		
		postAsObj paobj = new postAsObj();
		
		String abc = paobj.toString();
		
		System.out.println();
		
		
		
	}

}
