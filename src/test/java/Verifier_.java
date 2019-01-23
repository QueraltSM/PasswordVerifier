import org.junit.Test;

public class Verifier_ {

    @Test
    public void password_that_does_not_match_any_condition_return_false(){
        assert(!Verifier.verify(""));
    }

    @Test
    public void password_that_match_2_3_4_conditions_should_return_true(){
        assert(Verifier.verify("cNbhhc"));
    }

    @Test
    public void password_that_match_all_conditions_should_return_true(){
        assert(Verifier.verify("XtQeyjPdl9"));
    }

    @Test
    public void password_that_match_1_4_5_conditions_should_return_true(){
        assert(Verifier.verify("b86wduxnw"));
    }

    @Test
    public void password_that_does_not_match_4_condition_should_return_false(){
        assert(!Verifier.verify("DHU4A9LXW"));
    }
}