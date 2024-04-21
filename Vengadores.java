public class Vengadores extends Heroe {
    private String equipo;
public Vengadores (String nombre,String poder,String arma,String equipo){
    super(nombre, poder, arma);
    this.equipo=equipo;
    }
    public void reunirse(){
        System.out.println(nombre+" Se une al equipo"+ equipo + "de los Vengadores");
}
}