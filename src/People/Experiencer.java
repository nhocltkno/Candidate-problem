package People;

public class Experiencer extends Candidate {
    protected int expYear;
    protected String proSkill;


    public Experiencer( String iD, String name, int date, String address, String phoneNumber, String email, int type, int expYear, String proSkill ) {
        super(iD, name, date, address, phoneNumber, email, type);
        this.expYear = expYear;
        this.proSkill = proSkill;
    }


    public void setExpYear( int expYear ) {
        this.expYear = expYear;
    }


    public void setProSkill( String proSkill ) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return iD+";"+ name+";"+date+";"+address+";"+phoneNumber+";"+email+";"+type +";"+expYear+";"+ proSkill;
    }
}
