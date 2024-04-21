public class Thanos extends Villano{
    private String guantelete;
public Thanos (String nombre,String poder,String ejercito,String guantelete){
    super(nombre, poder, ejercito);
    this.guantelete=guantelete;
}
public void chasqueardedos(){
    System.out.println(nombre+" utiliza el guantelete del infinito"+guantelete);
}
}