public class Programmers_962 {
    public String Programmers(int age){
        String age_1 = "" + age;
        String answer = age_1.replaceAll("0" , "a").replaceAll("1" , "b").replaceAll("2" , "c").replaceAll("3" , "d").replaceAll("4" , "e").replaceAll("5" , "f").replaceAll("6" , "g").replaceAll("7" , "h").replaceAll("8" , "i").replaceAll("9" , "j");
        return answer;
    }
    public static void main(String[] args){
        Programmers_962 pro = new Programmers_962();
        String a = pro.Programmers(52);
        System.out.println(a);
    }
}
