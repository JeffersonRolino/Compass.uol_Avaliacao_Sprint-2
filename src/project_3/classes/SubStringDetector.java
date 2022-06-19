package project_3.classes;

public class SubStringDetector {
    public static void stringIterator(String string){
        int happyCounter = 0;
        int sadCounter = 0;

            if(string.contains(":-)") && !string.contains(":-(")){
                System.out.println("divertido");
            }
            else if(!string.contains(":-)") && string.contains(":-(")){
                System.out.println("chateado");
            }
            else if(!string.contains(":-)") && !string.contains(":-(")){
                System.out.println("neutro");
            }
            else {
                for(int i = 0; i < string.length(); i++) {
                    char c;
                    c = string.charAt(i);
                    if(c == ':' && string.charAt(i + 1) == '-' && string.charAt(i + 2) == ')'){
                        happyCounter++;
                    }
                    if(c == ':' && string.charAt(i + 1) == '-' && string.charAt(i + 2) == '('){
                        sadCounter++;
                    }
                }
                if(happyCounter > sadCounter){
                    System.out.println("divertido");
                }
                else if(happyCounter < sadCounter){
                    System.out.println("chateado");
                }
                else {
                    System.out.println("neutro");
                }
            }
    }

}
