class Animal {
        private String mDataNascimento;
        private Integer mIdentidade;
        private String mRaca;

        public Animal(String dataNascimento,
                      Integer identidade,
                      String raca) {
                mDataNascimento = dataNascimento;
                mIdentidade = identidade;
                mRaca = raca;
        }

        public String getDataNascimento() {
                return mDataNascimento;
        }

        public Integer getIdentidade() {
                return mIdentidade;
        }

        public String getRaca() {
                return mRaca;
        }

        public String exibeSom() {
                return "";
        }
}
