class Gato extends Animal {
        private String mMia;

        public Gato(String dataNascimento, Integer identidade, String raca) {
                super(dataNascimento, identidade, raca);
                mMia = "Mia";
        }

        public String exibeSom() {
                return mMia;
        }
}
