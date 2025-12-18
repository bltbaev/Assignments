public class Participant {
    private String participantname;
    private int age;
    private String prepayment;

    public Participant(String participantname,int age,String prepayment){
        this.participantname=participantname;
        this.age=age;
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
        this.age = age;
    }

    public void setPrepayment(String prepayment) {
        this.prepayment = prepayment;
    }
    public void result(){
        System.out.println("Participant name: "+participantname+", Age: "+age+", Prepayment: "+prepayment);
    }
}
