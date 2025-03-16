package Ex8;

import java.time.LocalDate;

public class Empregado {
    private String nome;
    private double salarioMensal;
    private LocalDate dataIngresso;
    private int horasTrabalhoSemanais;

    public Empregado(String nome, double salarioMensal, LocalDate dataIngresso, int horasTrabalhoSemanais) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
        this.dataIngresso = dataIngresso;
        this.horasTrabalhoSemanais = horasTrabalhoSemanais;
    }
    public double reajustarPorTempo(){
        double reajuste;
        if(dataIngresso.isBefore(LocalDate.now().minusMonths(12))){
            reajuste = 0.07;
        }else{
            reajuste = 0.05;
        }
        salarioMensal += salarioMensal * reajuste;
        return salarioMensal;
    }
    public double calcularSalarioComHoraExtra(){
        if(horasTrabalhoSemanais > 40){
            int horasExtras = horasTrabalhoSemanais - 40;
            double valorPorHoraRegular = salarioMensal / 40;
            salarioMensal = salarioMensal + horasExtras * (valorPorHoraRegular * 0.5 + 25);
        }
        return salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public int getHorasTrabalhoSemanais() {
        return horasTrabalhoSemanais;
    }

    public void setHorasTrabalhoSemanais(int horasTrabalhoSemanais) {
        this.horasTrabalhoSemanais = horasTrabalhoSemanais;
    }

    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }

}
