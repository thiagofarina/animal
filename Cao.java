class Cao extends Animal {
        private String mLate;

        public Cao(String dataNascimento, Integer identidade, String raca) {
                super(dataNascimento, identidade, raca);
                mLate = "Late";
        }

        public String exibeSom() {
                return mLate;
        }
}
