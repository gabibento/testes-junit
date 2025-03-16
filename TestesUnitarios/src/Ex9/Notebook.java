    package Ex9;

    public class Notebook extends Computador{
        private double peso;

        public Notebook(String modelo, double ram, double armazenamento, double peso) {
            super(modelo, ram, armazenamento);
            this.peso = peso;
        }
        public void aumentarRam(double ram){
            this.ram += ram;
        }

        @Override
        public boolean rodarAplicacao(String aplicacao){
            return aplicacao.endsWith(".exe");
        }
    }
