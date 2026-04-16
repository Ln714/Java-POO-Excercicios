public class Aluno {
    private int Matricula;

    public Aluno(String nomePessoa, int idade, int matricula) {
        super(nomePessoa, idade);
        Matricula = matricula;
    }

    //GET
    public int getMatricula() {
        return Matricula;
    }
    //SET


    public void setMatricula(int matricula) {
        Matricula = matricula;
    }
@Override
public String Apresentar() {
        return "Sou o aluno: " + getnomepessoa() + " tenho " + getIdade() + " anos, matricula: " + getMatricula();
    }
}