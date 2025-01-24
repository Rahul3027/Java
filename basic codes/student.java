class studentDetails{
    String name, section;
    int  age,semester ;

    studentDetails(){
        
    }
    studentDetails(String a){
        name = a;
        System.out.println(name);
    }
    studentDetails( String a, int b){
        name = a;
        age = b;
    }
    studentDetails(String a, int b, int c){
        name = a;
        age = b;
        semester = c;
    }
    studentDetails(String a, int b, int c, String d){
        name = a;
        age = b;
        semester = c;
        section = d;
    }
}

public class student{
    public static void main(String[] args){
        //studentDetails s1 = new studentDetails("Rahul");
        
}
}
