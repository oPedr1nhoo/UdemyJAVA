package entities;

public class Aluno{

   private Integer ID;


    public Aluno(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }


    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Aluno aluno = (Aluno) object;

        return java.util.Objects.equals(ID, aluno.ID);
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (ID != null ? ID.hashCode() : 0);
        return result;
    }
}
