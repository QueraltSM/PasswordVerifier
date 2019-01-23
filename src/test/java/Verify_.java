import org.junit.Test;

public class Verify_ {

    @Test
    public void null_password_should_return_false(){
        assert(!Verifier.verify(null));
    }

    @Test
    public void password_with_lower_than_8_letters_should_return_false(){
        assert(!Verifier.verify("cNbhhc"));
    }

    @Test
    public void password_with_1_uppercase_letter_at_least_should_return_true(){
        assert(Verifier.verify("XtQeyjPdl9"));
    }

    @Test
    public void password_with_no_uppercasecase_letter_at_least_should_return_false(){
        assert(!Verifier.verify("b86wduxnw"));
    }

    @Test
    public void password_with_1_lowercase_letter_at_least_should_return_true(){
        assert(Verifier.verify("ciogsF80t"));
    }

    @Test
    public void password_with_no_lowercase_letter_at_least_should_return_false(){
        assert(!Verifier.verify("DHU4A9LXW"));
    }

    @Test
    public void password_with_at_least_1_number_should_return_true(){
        assert(Verifier.verify("ej2EXPQVZ8"));
    }

    @Test
    public void password_with_no_numbers_should_return_false(){
        assert(!Verifier.verify("seGkBhkx"));
    }
}