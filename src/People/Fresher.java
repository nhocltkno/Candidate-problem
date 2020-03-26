package People;

public class Fresher extends Candidate {
    protected int graDate;
    protected String graRank;
    protected String education;

    public Fresher( String iD, String name, int date, String address, String phoneNumber, String email, int type, int graDate, String graRank, String education ) {
        super(iD, name, date, address, phoneNumber, email, type);
        this.graDate = graDate;
        this.graRank = graRank;
        this.education = education;
    }


    public void setGraDate( int graDate ) {
        this.graDate = graDate;
    }


    public void setGraRank( String graRank ) {
        this.graRank = graRank;
    }


    public void setEducation( String education ) {
        this.education = education;
    }

    @Override
    public String toString() {
        return iD+";"+ name+";"+date+";"+address+";"+phoneNumber+";"+email+";"+type +";"+graDate+ ";"+ graRank+ ";"+education;
    }
}
