package People;

public class Candidate {
    protected String iD;
    protected String name;
    protected int date;
    protected String address;
    protected String phoneNumber;
    protected String email;
    protected int type;


    public Candidate( String iD, String name, int date, String address, String phoneNumber, String email, int type ) {
        this.iD = iD;
        this.name = name;
        this.date = date;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.type = type;
    }

    public Candidate() {

    }

    public String getID() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }


    public void setDate( int date ) {
        this.date = date;
    }


    public void setAddress( String address ) {
        this.address = address;
    }


    public void setPhoneNumber( String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }


    public void setEmail( String email ) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public int getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setType( int type ) {
        this.type = type;
    }

    @Override
    public String toString() {
        return iD+"|"+ name+" | "+date+" | "+address+" | "+phoneNumber+" | "+email+" | "+type;
    }
}
