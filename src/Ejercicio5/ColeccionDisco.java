package Ejercicio5;
public class ColeccionDisco{

    private String codigo="LIBRE";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;


    public ColeccionDisco(String codigo, String autor, String titulo, String genero, int duracion){
        this.setAutor(autor);
        this.setCodigo(codigo);
        this.setDuracion(duracion);
        this.setGenero(genero);
        this.setTitulo(titulo);
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public String toString() {
        String devolver="";

        devolver+="----------------------------------------------\n";
        devolver+="Codigo: "+this.getCodigo()+"\n";
        devolver+="Autor: "+this.getAutor()+"\n";
        devolver+="Titulo: "+this.getTitulo()+"\n";
        devolver+="genero: "+this.getAutor()+"\n";
        devolver+="duracion: "+this.getDuracion()+"\n";
        devolver+="----------------------------------------------\n";
        return devolver;
    }


}