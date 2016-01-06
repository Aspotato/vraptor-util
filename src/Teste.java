import br.com.aspotato.vraptorutil.requestvalidation.Validator;
import br.com.aspotato.vraptorutil.requestvalidation.validators.MinLengthValidator;
import br.com.aspotato.vraptorutil.requestvalidation.validators.NullableValidator;


public class Teste {

	public static void main(String[] args) {
	
		Validator validator = new Validator();
		
		validator.add(new NullableValidator("teste", null));
		validator.add(new MinLengthValidator("idade", "12", 3));
		
		if (!validator.isValid()) {
	        System.out.println(validator.errors().size());
        }
		
		
		
	}

}
