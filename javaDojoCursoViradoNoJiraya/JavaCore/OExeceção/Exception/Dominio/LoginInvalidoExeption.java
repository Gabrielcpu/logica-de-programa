package JavaCore.OExeceção.Exception.Dominio;

public class LoginInvalidoExeption extends Exception{
    public LoginInvalidoExeption() {
        super("login invalido");
    }

    public LoginInvalidoExeption(String message) {
        super(message);
    }
}
