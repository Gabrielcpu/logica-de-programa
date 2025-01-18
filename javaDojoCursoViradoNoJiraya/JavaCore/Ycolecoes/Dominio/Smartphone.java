package JavaCore.Ycolecoes.Dominio;

public class Smartphone {
    private String serialnumber;
    private String marca;

    public Smartphone(String marca, String serialnumber) {
        this.marca = marca;
        this.serialnumber = serialnumber;
    }

    // reflexivo : x.equals(x) tem que ser true para tudo que for diferente de null
    //Simetrico: para x e y diferente de null , se x. equals(y) == true logo , y.equals(x)== true
    //transitividade : para x,y,z diferentes de null , se x.equals(y) == true , e x.quals(z) == true logo , y.equals(z) == true
    //Consistente : x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null , x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialnumber != null && serialnumber.equals(smartphone.serialnumber);

    }
    //se x.equals(y) == true , y.hashCode(x) == x.hashCode()
    //y.hashCode() == x.HashCode() nao necessariamente o equals de y.equals(x) tem que ser true
    //x.equals(y) == false
    //y.hashCode() ! = x.hashCode() x.equals(y0 deverá ser false.

    @Override
    public int hashCode() {
        return serialnumber== null ? 0 : this.serialnumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "marca='" + marca + '\'' +
                ", serialnumber='" + serialnumber + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }
}
