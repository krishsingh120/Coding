public class staticKey {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "kv";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }
}


class Student{
    String Name;
    static String schoolName;  // koi bhi variable/obj khi bhi change krega to wo sabke liye change hoga 

}
