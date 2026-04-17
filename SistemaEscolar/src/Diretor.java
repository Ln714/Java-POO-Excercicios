public class Diretor extends Pessoa{
    private int TempoGestao;

    public Diretor(String nomePessoa, int idade, int tempoGestao) {
        super (nomePessoa, idade);
        TempoGestao = tempoGestao;
    }
    public int getTempoGestao() {
        return  TempoGestao;
    }
    public void setTempoGestao(int tempoGestao) {
        TempoGestao = tempoGestao;
    }
    @Override
    public String Apresentar(){
        return "Sou o diretor: " + getNomePessoa() + ", ha " + getTempoGestao() + "anos na gestão";
    }
}
