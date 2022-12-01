package Customized_Exception;

public class AtmExceptionTest {
	
		public static void main(String[] args) throws AtmException {
			int amount=4000;
			if(amount<3000) {
				throw new AtmException("in sufficient exception");
			}
			else if(amount>3000){
			throw new AtmException(" successfully withdraw your amount");
			}
			
		
	}

}
