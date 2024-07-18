package threading;

class MsWord extends Thread
{
	MsWord(String name) {
		super(name);
	}
	public void run() 
	{
		if (getName().equals("Typing"))
		{
			typing();
		}
	
		else if(getName().equals("SpellCheck"))
		{
			spellCheck();
		}
	
	    else {
			autosave();
		}
	 }


	void typing() 
	{
			try {
				for(int i=1;i<=5;i++) {
					System.out.println("Typing is in progess");
					Thread.sleep(2000);
					}
			}
				catch(Exception e) {
					System.out.println(e.getMessage());
			}
		}
		
		void spellCheck() {
			try {
				for(int i=1;i<=5;i++) {
					System.out.println("SpellCheck is in progess");
					Thread.sleep(2000);
				}
			}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			
			
		}
		
		void autosave() 
		{
			try {
				for(int i=1;i<=5;i++) {
					System.out.println("Auto is in progess");
					Thread.sleep(2000);
				}
			}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			
			
		}
	}


public class Demo3 {
	public static void main(String[]args) {
		MsWord ms1=new MsWord("Typing");
		MsWord ms2=new MsWord("SpellCheck");
		MsWord ms3=new MsWord("autosave");
		ms1.start();
		ms2.start();
		ms3.start();
		
	}
	

}
