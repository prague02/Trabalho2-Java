import java.util.Scanner;

public class LoginMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] logins = {
            {"usuario1", "senha1"},
            {"usuario2", "senha2"},
            {"usuario3", "senha3"},
            {"usuario4", "senha4"},
            {"usuario5", "senha5"},
            {"usuario6", "senha6"}
        };

        System.out.print("Digite seu login: ");
        String login = scanner.next();

        System.out.print("Digite sua senha: ");
        String senha = scanner.next();

        boolean autenticado = false;
        for (int i = 0; i < logins.length; i++) {
            if (logins[i][0].equals(login) && logins[i][1].equals(senha)) {
                autenticado = true;
                break;
            }
        }

        if (autenticado) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Login ou senha incorretos.");
        }

        scanner.close();
    }
}
