import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    ArrayList<Pessoa> p = new ArrayList<>();

    p.add(new Aluno("Vagner", 17, 8547932));
    p.add(new Professor("Patricia", 28, "Geografia"));
    p.add(new Diretor("Gabriela", 48,16));

    for (Pessoa pessoa : p) {
        System.out.println(pessoa.Apresentar());
        }
    }
}
