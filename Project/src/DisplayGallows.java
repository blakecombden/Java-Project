public class DisplayGallows {

    public static void displayGallows(int errors) {

        String pole = " |";
        String noose = "\t" + pole;
        String head = "\t 0";
        String torso = "|";
        String leftLimb = "  /";
        String rightLimb = "\\";

        System.out.println(" +---+");

        if (errors == 0) {


            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);


        } else if (errors == 1) {


            System.out.println(pole + noose);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);


        } else if (errors == 2) {


            System.out.println(pole + noose);
            System.out.println(pole + head);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);


        } else if (errors == 3) {


            System.out.println(pole + noose);
            System.out.println(pole + head);
            System.out.println(pole + "\t " + torso);
            System.out.println(pole);
            System.out.println(pole);


        } else if (errors == 4) {


            System.out.println(pole + noose);
            System.out.println(pole + head);
            System.out.println(pole + leftLimb + torso);
            System.out.println(pole);
            System.out.println(pole);


        } else if (errors == 5) {


            System.out.println(pole + noose);
            System.out.println(pole + head);
            System.out.println(pole + leftLimb + torso + rightLimb);
            System.out.println(pole);
            System.out.println(pole);


        } else if (errors == 6) {


            System.out.println(pole + noose);
            System.out.println(pole + head);
            System.out.println(pole + leftLimb + torso + rightLimb);
            System.out.println(pole + leftLimb);
            System.out.println(pole);


        } else if (errors == 7) {


            System.out.println(pole + noose);
            System.out.println(pole + head);
            System.out.println(pole + leftLimb + torso + rightLimb);
            System.out.println(pole + leftLimb + " " + rightLimb);
            System.out.println(pole);


        }
        System.out.println("=========");
    }
}
