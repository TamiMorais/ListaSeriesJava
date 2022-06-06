import java.util.ArrayList;

public class ListaSerie {
    
    private ArrayList<Serie>lista = new ArrayList<Serie>();

    public void incluirSerie(Serie serie){
        this.lista.add(serie);

    }
    public void retornarSerie(){
        for (int index = 0; index < this.lista.size(); index++) { 
            System.out.println(this.lista.get(index).getSerieNome());
        }
        // System.out.println(this.lista);
    }
    public void retornarSerieDetalhes(){
        for (int index = 0; index < this.lista.size(); index++) { 
            this.lista.get(index).exibir();
        }
     
    }
}

