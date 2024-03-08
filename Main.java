import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("inserisci una parola");
        String parola=in.nextLine();
        System.out.println("vocali: "+vocali(parola)+"; consonanti: "+consonanti(parola));
    }

    private static boolean isVocal(char x){
        boolean vocale=false;
        if (x>='a'&&x<='z'||x>='A'&&x<='Z'){
            if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
                vocale=true;
        }
        return vocale;
    }

    private static boolean isConsonant(char x){
        boolean consonant=false;
        if (x>='a'&&x<='z'||x>='A'&&x<='Z'){
            if (!isVocal(x))
                consonant=true;
        }
        return consonant;
    }

    private static String vocali(String x){
        String vocali="";
        for (int i=0;i<x.length();i++){
            if (isVocal(x.charAt(i)))
                    vocali+=x.charAt(i);
        }
        return vocali;
    }

    private static String consonanti(String x){
        String consonanti="";
        for (int i=0;i<x.length();i++){
            if (isConsonant(x.charAt(i)))
                    consonanti+=x.charAt(i);
        }
        return consonanti;
    }
}