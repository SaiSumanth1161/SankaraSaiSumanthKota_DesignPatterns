package structural;

public class DupFile implements File{
	private String document;
	private OrgFile org_document;
	  
	DupFile(String document)
	{
		this.document=document;		
	}
	public void copy()
	{		
		if(org_document==null)
		{
			org_document =new OrgFile(document);
		}
		org_document.copy();
	}	
	
}