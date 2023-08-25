public class Aluno {
    int horasExtrasCursadas, periodo, cr;
    String nome, departamento, curso, matricula;



    Aluno() {
        this.nome = "A atualizar";
    }

    Aluno(String nome, String departamento, String curso, int periodo, int horasExtrasCursadas, int cr, String matricula) {
        this.nome = nome;
        this.departamento = departamento;
        this.curso = curso;
        this.periodo = periodo;
        this.horasExtrasCursadas = horasExtrasCursadas;
        this.matricula = matricula;
    }



    void atualizarHorasExtrasCursadas(int horasExtrasCursadas,int horasExtras) {
        this.horasExtrasCursadas = horasExtrasCursadas + horasExtras;
    }


}