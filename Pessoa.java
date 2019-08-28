package rp;

public class Pessoa 
{
	
	private String NomePessoa = "Ana";
	private Integer LocalX;
	private Integer LocalY;
	
	public Pessoa()
	{
		super();
	}
	
	public Pessoa(Integer NovoLocalX, Integer NovoLocalY)
	{
	super();
	
		if(NovoLocalX < 101 && NovoLocalX > 0)
		{
			
		this.LocalX = NovoLocalX;
		
		}else if (NovoLocalX < 0)
		{
			
			this.LocalX = 0;
			System.out.println("Pessoa esta saindo do mundo");
			
		}else if (NovoLocalX > 100)
		{
			this.LocalX = 100;
			System.out.println("Pessoa esta saindo do mundo");
		}
		
		if(NovoLocalY < 101 && NovoLocalY > 0)
		{
			
			this.LocalY = NovoLocalY;
			
		}else if(NovoLocalY < 0)
		{
			this.LocalY = 0;
			System.out.println("Pessoa esta saindo do mundo");
			
		}else if(NovoLocalY > 100)
		{
			this.LocalY = 100;
			
		}
	
	}
	
	public String getNomePessoa() 
	{
		return this.NomePessoa;
	}
	
	public Integer getLocalX()
	{
		return this.LocalX;
	}
	
	public Integer getLocalY()
	{
		return this.LocalY;
	}
	
	public void setLocalX(Integer LocalX)
	{
		this.LocalX = LocalX;
	}
	
	public void setLocalY(Integer LocalY)
	{
		this.LocalY = LocalY;
	}
}