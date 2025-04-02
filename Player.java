public class Player 
{
	private String playerName;
	private String playerCountry;
	
	public Player()
	{
		this("Dhoni");
		playerCountry="India";
	}
	public Player(String playerName)
	{
		this.playerName=playerName;
	}
	public String display()
	{
		return "PlayerName= "+playerName+" PlayerCountry = "+playerCountry;
	}
	
	public static void main(String[] args) {
		Player p=new Player();
		System.out.println(p.display());
	}
	
	

}
