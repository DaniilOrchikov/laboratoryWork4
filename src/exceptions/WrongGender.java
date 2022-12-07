package exceptions;

public class WrongGender extends RuntimeException{
    public WrongGender(){
        super("Мы признаем только два гендера");
    }
}
