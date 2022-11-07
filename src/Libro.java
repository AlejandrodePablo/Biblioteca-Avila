public class Libro {

    private Integer isbn;
    public String titulo;
    public String autor;
    public String genero;
    public Integer fechadepublicacion;

        public Integer getIsbn() {
            return isbn;
        }

        public void setIsbn(Integer isbn) {
            this.isbn = isbn;
        }

        public String getTitulo(){
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public Integer getFechadepublicacion() {
            return fechadepublicacion;
        }

        public void setFechadepublicacion(Integer fechadepublicacion) {
            this.fechadepublicacion = fechadepublicacion;
        }
}

