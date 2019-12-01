package pojojsonObj;

public class GlossEntry {
	
	private String ID;
	private String SortAs;
	private String GlossTerm;
	private String Acronym;
	private String Abbrev;
	public GlossDef gossdef;
	private String GlossSee;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getSortAs() {
		return SortAs;
	}

	public void setSortAs(String sortAs) {
		SortAs = sortAs;
	}

	public String getGlossTerm() {
		return GlossTerm;
	}

	public void setGlossTerm(String glossTerm) {
		GlossTerm = glossTerm;
	}

	public String getAcronym() {
		return Acronym;
	}

	public void setAcronym(String acronym) {
		Acronym = acronym;
	}

	public String getAbbrev() {
		return Abbrev;
	}

	public void setAbbrev(String abbrev) {
		Abbrev = abbrev;
	}

	public GlossDef getGossdef() {
		return gossdef;
	}

	public void setGossdef(GlossDef gossdef) {
		this.gossdef = gossdef;
	}

	public String getGlossSee() {
		return GlossSee;
	}

	public void setGlossSee(String glossSee) {
		GlossSee = glossSee;
	}
	
	
	

}
