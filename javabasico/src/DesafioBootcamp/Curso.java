public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){

    }

    public int getCargaHoraria() {
        return data;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}