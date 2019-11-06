
class Movie {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String name;
	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No Plot Here";
	}
}
	/*  															the first class ends here 								*/
	class Dhoom extends Movie  {
		
		public Dhoom() {
			super("Dhoom");
		}
		public String plot() {
			
			return "Chori chakari";
		}
	}
	
	class Singham extends Movie {
		
		public Singham() {
			super("Singham");
		}
		public String plot() {
			return "Polic wala gunda";
		}
	}

	class BajiraoMastani extends Movie {
		
		public BajiraoMastani() {
			super("BajiraoMastani");
		}
		public String plot() {
			return "revolves around two fools in love - chutia story as u can see";
		}
	}
	
	class rajaHindustani extends Movie {
		
	   public rajaHindustani() {
		   super("rajaHindustani");
	   }
	  
	}
	public class Main {

	public static void main(String [] args) {
	
		for(int i=1; i<= 8;i++) {
			
			Movie movie = randomMovie();
			System.out.println("Movie # " + i + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
		}
		
	}
	 public static Movie randomMovie() {
		 
		 
		 int randomnumber = (int) (Math.random() * 5);
		 System.out.println("The randomly generated number is :" + randomnumber);
		 
		 switch(randomnumber) {
			     case 1:
				 return new Dhoom();
			 
			     case 2: 
				 return new Singham();
			 
			     case 3:
				 return new BajiraoMastani();
				 
			 
			     case 4: 
				 return  new rajaHindustani();
		 }
		 
		return null;
		 }
	}
