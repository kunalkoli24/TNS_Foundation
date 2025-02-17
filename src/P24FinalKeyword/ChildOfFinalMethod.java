package P24FinalKeyword;

public class ChildOfFinalMethod extends FinalMethods{
    //final method can not be override
    //void finalMethod(){
    // }

    @Override
    void notFinalMethod() {
        super.notFinalMethod();
    }
}