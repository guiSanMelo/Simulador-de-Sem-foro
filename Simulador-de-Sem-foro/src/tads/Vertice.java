package tads;

public class Vertice {
        private int id;
        private String nome;

        public Vertice(int id) {
                this.id = id;
        }

        public Vertice(int id, String nome) {
                this.id = id;
                this.nome = nome;
        }

        public int getId() {
                return id;
        }

        public String getNome() {
                return nome;
        }


        @Override
        public String toString() {
                if (nome != null) {
                        return "Vertice{id=" + id + ", nome='" + nome + "'}";
                }
                return "Vertice{id=" + id + "}";
        }



        @Override
        public boolean equals(Object obj) {
                if (this == obj) return true;
                if (!(obj instanceof Vertice)) return false;
                Vertice outro = (Vertice) obj;
                return this.id == outro.id;
        }

        @Override
        public int hashCode() {
                return Integer.hashCode(id);
        }
}


