import java.util.Objects;
public class Participant {
    private String participantname;
    private int age;
    private String prepayment;

    public Participant(String participantname,int age,String prepayment){
        this.participantname=participantname;
        this.setAge(age);
        this.prepayment=prepayment;
    }
    public String getParticipantname() {
        return participantname;
    }
    public int getAge() {
        return age;
    }
    public String getPrepayment() {
        return prepayment;
    }
    public void setParticipantname(String participantname) {
        this.participantname = participantname;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Enter the real age");
        } else {
            this.age = age;
        }
    }
    public void setPrepayment(String prepayment) {
        this.prepayment = prepayment;
    }

    @Override
    public String toString(){
        return "Participant name: "+participantname+", Age: "+age+", Prepayment: "+prepayment;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return age == that.age &&
                Objects.equals(participantname, that.participantname) &&
                Objects.equals(prepayment, that.prepayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantname, age, prepayment);
    }
}
