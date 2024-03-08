import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("inserisci una parola");
        String parola=in.nextLine();
        System.out.println("vocali: "+vocali(parola)+"; consonanti: "+consonanti(parola));
    }

    private static String vocali(String x){
        String vocali="";
        for (int i=0;i<x.length();i++){
            if (x.charAt(i)>='a'&&x.charAt(i)<='z'){
                if (x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u')
                    vocali=vocali+x.charAt(i);
            }
        }
        return vocali;
    }

    private static String consonanti(String x){
        String consonanti="";
        for (int i=0;i<x.length();i++){
            if (x.charAt(i)>='a'&&x.charAt(i)<='z'){
                if (x.charAt(i)!='a'&&x.charAt(i)!='e'&&x.charAt(i)!='i'&&x.charAt(i)!='o'&&x.charAt(i)!='u')
                    consonanti=consonanti+x.charAt(i);
            }
        }
        return consonanti;
    }
}