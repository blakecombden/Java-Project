public class DisplayGallows {

    public static void displayGallows(int errors) {

        String top = "\t+---+";
        String pole = "\t|";
        String floor = "  =========";
        String head = "\t0";
        String torso = "|";
        String leftLimb = "  /";
        String rightLimb = "\\";

        if (errors == 0) {

            System.out.println(top);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(floor);

        } else if (errors == 1) {

            System.out.println(top);
            System.out.println(pole + pole);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(floor);

        } else if (errors == 2) {

            System.out.println(top);
            System.out.println(pole + pole);
            System.out.println(pole + head);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(floor);

        } else if (errors == 3) {

            System.out.println(top);
            System.out.println(pole + pole);
            System.out.println(pole + head);
            System.out.println(pole + "\t" + torso);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(floor);

        } else if (errors == 4) {

            System.out.println(top);
            System.out.println(pole + pole);
            System.out.println(pole + head);
            System.out.println(pole + leftLimb + torso);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(floor);

        } else if (errors == 5) {

            System.out.println(top);
            System.out.println(pole + pole);
            System.out.println(pole + head);
            System.out.println(pole + leftLimb + torso + rightLimb);
            System.out.println(pole);
            System.out.println(pole);
            System.out.println(floor);

        } else if (errors == 6) {

            System.out.println(top);
            System.out.println(pole + pole);
            System.out.println(pole + head);
            System.out.println(pole + leftLimb + torso + rightLimb);
            System.out.println(pole + leftLimb);
            System.out.println(pole);
            System.out.println(floor);

        } else if (errors == 7) {

            System.out.println(top);
            System.out.println(pole + pole);
            System.out.println(pole + head);
            System.out.println(pole + leftLimb + torso + rightLimb);
            System.out.println(pole + leftLimb + " " + rightLimb);
            System.out.println(pole);
            System.out.println(floor);

        }
    }
}
