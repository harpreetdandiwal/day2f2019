public class collegeexample {
    public static void main(String[] args) {

        Arithmetic a1 =new Arithmetic();
        System.out.println("sum is :"+ a1.add(15,20));
        System.out.println("sum is :"+ a1.mul(15,20));
        System.out.println("sum is :"+ a1.sub(15,20));
        System.out.println("sum is :"+ a1.div(15,20));
        student s1 = new student();
        s1.setFirstname("harpreet");
        s1.setLastname("dandiwal");
        s1.setMarks1(70);
        s1.setMarks2(50);
        s1.setMarks3(50);
        s1.setMarks4(75);
        System.out.println(s1.getFirstname());
        System.out.println(s1.getLastname());
        System.out.println(s1.marks1);
        System.out.println(s1.marks2);
        System.out.println(s1.marks3);
        System.out.println(s1.marks4);

s1.calulatetotal();
s1.calculatepercentage();
s1.generateresults();

    }
}
