package android.example.studentrecyclerview;public class StudentInfo {
    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String phonenum;
    String name;
    public StudentInfo(String phonenum, String name) {
        this.phonenum = phonenum;
        this.name = name;
    }


}
