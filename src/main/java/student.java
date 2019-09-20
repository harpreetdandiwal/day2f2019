public class student {

    int studentID;
    String firstname;
    String lastname;

    int marks1;
    int marks2;
    int marks3;
    int marks4;
    int total;
   private boolean deteremineresults()
   {
       int count=0;
       if (marks4<50){
           count++;
       }
       if (marks3<50){
           count++;
       }
       if (marks2<50){
           count++;
       }
       if (marks1<50){
           count++;
       }
       if (count>=2)
       {
         return false;
       }
       return true;

   }


    float percentage;
    String result;

    public void calulatetotal()
    {
        total = marks1 + marks2 + marks3 + marks4;
    }
    public void calculatepercentage()
    {
        percentage =total/5*100;
    }
    public void generateresults()
    {
        if (deteremineresults())
        {
            System.out.println("pass");

        }
        else {
             System.out.println("fail");
        }
    }
    public int getStudentID()
    {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public String getfullname()
    {
        return (firstname + " " + lastname);
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getMarks4() {
        return marks4;
    }

    public void setMarks4(int marks4) {
        this.marks4 = marks4;
    }

    public int getTotal() {
        return total;
    }



    public float getPercentage() {
        return percentage;
    }



    public String getResult() {
        return result;
    }


}
