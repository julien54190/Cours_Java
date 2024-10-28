
import java.util.Objects;


public class Fruit {
    private String Name;
    private String Color;
    private String Origin;

    public Fruit(String name, String color, String origin) {
        this.Name = name;
        this.Color = color;
        this.Origin = origin;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (obj.getClass() != this.getClass())
    //         return false;

    //     Fruit fruit = (Fruit) obj;

    //     if (!fruit.Name.equals(this.Name)) return false;
    //     if (!fruit.Color.equals(this.Color)) return false;
    //     return fruit.Origin.equals(this.Origin);
    // }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.Name);
        hash = 47 * hash + Objects.hashCode(this.Color);
        hash = 47 * hash + Objects.hashCode(this.Origin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fruit other = (Fruit) obj;
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Color, other.Color)) {
            return false;
        }
        return Objects.equals(this.Origin, other.Origin);
    }

    @Override
    public String toString() {
        return "Fruit [Name=" + Name + ", Color=" + Color + ", Origin=" + Origin + "]";
    }

}
