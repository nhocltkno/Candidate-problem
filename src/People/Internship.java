package People;

public class Internship extends Candidate {
    protected String major;
    protected String semester;
    protected String uniName;


    public Internship( String iD, String name, int date, String address, String phoneNumber, String email, int type, String major, String semester, String uniName ) {
        super(iD, name, date, address, phoneNumber, email, type);
        this.major = major;
        this.semester = semester;
        this.uniName = uniName;
    }


    public void setMajor( String major ) {
        this.major = major;
    }

    public void setSemester( String semester ) {
        this.semester = semester;
    }

    public void setUniName( String uniName ) {
        this.uniName = uniName;
    }

    public String toString(){
        return iD+";"+ name+";"+date+";"+address+";"+phoneNumber+";"+email+";"+type +";"+major+ ";"+semester +";"+uniName;
    }
}
