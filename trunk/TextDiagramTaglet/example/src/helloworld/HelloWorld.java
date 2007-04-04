package helloworld;
/** Simple Hello World program.
 * <p>
 * The program takes a name as an argument and prints a greeting message.
 * This can also be described as:<br>
 * {@textdiagram overview
 * +---------+    +----------+    +--------+
 * |Your name|--->|HelloWorld|--->|Greeting|
 * |[io]     |    |   app    |    |[io]    |
 * +---------+    +----------+    +--------+
 * }
 */
public class HelloWorld {
    public static void main(String[] args) {
	if(args.length == 0) {
	    System.out.println("Hello stranger!");
	} else {
	    Syste.out.println("Hello "+args[1]+"!");
	}
    }
}