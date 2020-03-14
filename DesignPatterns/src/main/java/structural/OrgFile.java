package structural;

public class OrgFile {

	private String document;
	OrgFile(String document)
	{
		this.document=document;
		load(document);
	}
	public void copy()
	{
		System.out.println("Sharing file: "+document);
	}
	public void load(String read)
	{
		System.out.println("loading the file to be shared "+read);
	}	
}
