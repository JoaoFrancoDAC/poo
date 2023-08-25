public class App {
    public static void main(String[] args) throws Exception {
        Palestra pal1;
        Aluno alu1;
        Palestrante palestrante1;

        pal1 = new Palestra();
        pal1.palestrante = "Victor";
        pal1.departamento = "TECH";
        pal1.titulo = "POO";
        pal1.endereco = "IBMEC BARRA - Segundo andar, 213";
        pal1.data = "25/08/2023";
        pal1.horasExtras = 2;

        alu1 = new Aluno();
        alu1.nome = "Joao";
        alu1.departamento = "TECH";
        alu1.periodo = 2;
        alu1.curso = "Ciencia de Dados";
        alu1.horasExtrasCursadas = 0;
        alu1.matricula = "202303224095";

        palestrante1 = new Palestrante();
        palestrante1.nome = "Victor";
        palestrante1.telefone = "+55 21 984348181";
        palestrante1.email = "victor@email.com";

    

    }

}