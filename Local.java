package rp;

public class Local 
{
	
	private Integer LimiteX;
	private Integer LimiteY;
	private String NomeLocal; 
	
	public Local() 
	{
		super();
	}
	
	public Local(String NomeLocal , Integer LimiteX, Integer LimiteY)
	{
		this.NomeLocal = NomeLocal;
		this.LimiteX = LimiteX;
		this.LimiteY = LimiteY;
	}
	
	public String getNomeLocal()
	{
		return this.NomeLocal;
	}
	
	public Integer getLimiteX()
	{
		return LimiteX;
	}
	
	public Integer getLimiteY()
	{
		return LimiteY;
	}
	
	public void setLimiteX(Integer LimiteX)
	{
		this.LimiteX = LimiteX;
	}
	
	public void setLimiteY(Integer LimiteY)
	{
		this.LimiteY =LimiteY;
	}
	
	public void setNomeLocal(String NomeLocal)
	{
		this.NomeLocal = NomeLocal;
	}
	
	
}