package week5CodingAssignement;

public  class SpacedLogger implements Logger {
	 
	public void Log (String log) {
		for (int charIndex = 0; charIndex < log.length(); charIndex++) {
			System.out.print(log.charAt(charIndex));
			if (charIndex < log.length()){
				System.out.print(" ");
			}
			
		}
		
		
	}

	public void Error (String error) {
		System.out.print("ERROR: ");
		for (int charIndex = 0; charIndex < error.length(); charIndex++) {
			System.out.print(error.charAt(charIndex));
			if (charIndex < error.length()){
				System.out.print(" ");
			}
			
		}
		
	}

}
