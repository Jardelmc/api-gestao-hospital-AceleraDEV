package gestao.models.banco_de_sangue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * Classe Responsavél pela criação do banco de sangue.
 *
 * @author Michael Ulguim
 *
 */
public class BancoDeSangueFactory {
    public static Map<BancoDeSangueENUM, Integer> createDefault() {
        Map<BancoDeSangueENUM, Integer> bancoDeSangue = new HashMap<>();
        Arrays.stream(BancoDeSangueENUM.values()).forEach(x -> bancoDeSangue.put(x, 0));
        return bancoDeSangue;
    }
}
