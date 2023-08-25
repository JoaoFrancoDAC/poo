public class Palestra {
    int vagasDisponiveis;
    int horasExtras;
    String palestrante, titulo, departamento, endereco, data;
    Aluno al1;


    Palestra() {
        this.titulo = "Sem titulo";
    }


    Palestra(String palestrante, String departamento, String titulo, String endereco, String data, int horasExtras, int vagasDisponiveis) {
        this.palestrante = palestrante;
        this.departamento = departamento;
        this.titulo = titulo;
        this.endereco = endereco;
        this.data = data;
        this.horasExtras = horasExtras;
        this.vagasDisponiveis = vagasDisponiveis;
    }
    

    void mudarPalestrante(String novaPalestrante) {
        this.palestrante = novaPalestrante;
    }


    void mudarData(String novaData) {
        this.data = novaData;
    }


    void mudarHorasExtras(int novaHorasExtras) {
        this.horasExtras = novaHorasExtras;
    }


    void mudarVagasDisponiveis(int novaVagasDisponiveis) {
        this.vagasDisponiveis = novaVagasDisponiveis;
    }
 
}