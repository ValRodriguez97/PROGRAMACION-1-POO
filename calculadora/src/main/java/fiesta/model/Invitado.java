package fiesta.model;

public class Invitado implements IInvitado{

    private String nombre;

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombew (){
        return nombre;
    }

    public void comer(){
        System.out.println("Inivitado Comiendo");
    }

    public void bailar(){
        System.out.println("Invitado Bailando");
    }

    public void tomar(){
        System.out.println("Invitado tomando");
    }
}
