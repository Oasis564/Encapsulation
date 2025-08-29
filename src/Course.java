

interface Course {

    void getName(String name);

    void getMarks(int Mathematics, int Physics, int Chemistry);

    int getTotal(int Mathematics, int Physics, int Chemistry);

    void eligible(int Mathematics, int Physics, int Chemistry, int total);
}

class EligibilityCheck implements Course {

    public void getName(String name) {
        System.out.println("\n Name of candidate : " + name + "\n");
    }

    public void getMarks(int Mathematics, int Physics, int Chemistry) {
        System.out.println("\n Marks of Mathematics : " + Mathematics + "\n");
        System.out.println("\n Marks of Physics : " + Physics + "\n");
        System.out.println("\n Marks of Chemistry : " + Chemistry + "\n");
    }

    public int getTotal(int Mathematics, int Physics, int Chemistry) {
        System.out.println("\n Total Marks : " + (Mathematics + Physics + Chemistry) + "\n");
        return (Mathematics + Physics + Chemistry);
    }

    public void eligible(int Mathematics, int Physics, int Chemistry, int total) {
        if (Mathematics >= 60) {
            if (Physics >= 50) {
                if (Chemistry >= 40) {
                    if (total >= 200) {
                        System.out.println("\n" + "Congratulations! You are eligible to take up the professional course at Awesome University!");
                    } else {
                        System.out.println("\n" + "Ooops! Looks like your total marks doesn't fulfills the criteria!");
                    }
                } else {
                    System.out.println("\n" + "Ooops! Looks like your Chemistry marks doesn't fulfills the criteria!");
                }
            } else {
                System.out.println("\n" + "Ooops! Looks like your Physics marks doesn't fulfills the criteria!");
            }
        } else {
            System.out.println("\n" + "Ooops! Looks like your Mathematics marks doesn't fulfills the criteria!");
        }
    }
}
