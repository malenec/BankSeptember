import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ans = "";

        Dialog dialog = new Engelsk();

        while (true) {

            System.out.println(dialog.hi());
            // System.out.println(dialog.changeLanguage());
            // ans = scanner.nextLine();


            if (Input.getString(dialog.changeLanguage()).equalsIgnoreCase("y")) {
                // System.out.println(dialog.selectLanguage());
                //  ans = scanner.nextLine();

                switch (Input.getString(dialog.selectLanguage())) {

                    case "dk":
                        dialog = new Dansk();
                        break;
                    case "eng":
                        dialog = new Engelsk();
                        break;
                    case "suo":
                        dialog = new Finsk();
                        break;
                    default:
                        dialog = new Engelsk();

                }

            }

        }


    }

}
