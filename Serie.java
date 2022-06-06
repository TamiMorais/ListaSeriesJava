import java.util.ArrayList;

public class Serie {
    private String nome;
    private Genero genero;
    private int quantidadeTemporadas;
    private ArrayList<String> listaPersonagens = new ArrayList<String>();

    public Serie(String nome , Genero genero , int quantidadeTemporadas){
        this.nome = nome;
        this.genero = genero;
        this.quantidadeTemporadas = quantidadeTemporadas;

    }
    public void inserirPersonagem(String nomePersonagem){
        this.listaPersonagens.add(nomePersonagem);
    }
    public void removerPersonagem(String nomePersonagem){
        this.listaPersonagens.remove(nomePersonagem);
    }
    public void corrigirNome(String novoNome){
        this.nome = novoNome;

    }

    public void exibir(){
        System.out.println("Nome da Série : " + this.nome);
        System.out.println("Do seguinte Gênero : " + this.genero);
        System.out.println("Quantidade de Temporadas: " + this.quantidadeTemporadas);
        System.out.println("Personagens da Série: ");
        if (this.listaPersonagens.size() > 0){
            for (int index = 0; index < this.listaPersonagens.size(); index++) { 
                System.out.println(this.listaPersonagens.get(index));
            }
        } else {
            System.out.println(" Não há personagens cadastrados!");
        }
    }
    public String getSerieNome(){
        return this.nome;
    }
   
}
