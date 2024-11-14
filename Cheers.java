public class Cheers {
public static void main(String[] args) {
String cheers = args[0];
int number = Integer.parseInt(args[1]);

String special = "AEFHILMNORSX"; 
String upperCaseInput = cheers.toUpperCase();

for (int i = 0; i < upperCaseInput.length(); i++){
        if(special.indexOf(upperCaseInput.charAt(i)) != -1){
                System.out.println("Give me an " + upperCaseInput.charAt(i) + ": " + upperCaseInput.charAt(i) + " !" );}
        else{ System.out.println("Give me a " + upperCaseInput.charAt(i) + ": " + upperCaseInput.charAt(i) + " !" );}}

System.out.println("What does that spell?");

for (int j = 0; j < number; j++) {
System.out.println(upperCaseInput + "!!!");}

}
}