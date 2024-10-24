Class StudentGrading {
    public static void main(String[]args) {
		 // Create a Scanner object.
        Scanner scanner = new Scanner(System.in); 

        // Ask the tutor to enter marks for Assignment 1.
        System.out.println("Enter marks for Assignment 1");
        double assignment1 = scanner.nextDouble();

        // Ask the tutor to enter marks for Assignment 2.
        System.out.println("Enter marks for Assignment 2");
        double assignment2 = scanner.nextDouble();

        // Ask the tutor to enter marks for CAT 1.
        System.out.println("Enter marks for CAT 1");
        double cat1 = scanner.nextDouble();

        // Ask the tutor to enter marks for CAT 2.
        System.out.println("Enter marks for CAT 2");
        double cat2 = scanner.nextDouble();

        // Calculate the average marks of the coursework.
        double average = (assignment1 + assignment2 + cat1 + cat2) / 4;

        // Determine the grade based on the average marks.
        if (average >= 40) {
            System.out.println("Grade: A");
        } else if (average >= 30) {
            System.out.println("Grade: B");
        } else if (average >= 20) {
            System.out.println("Grade: C");
        } else if (average >= 10) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        scanner.close();  // Close the Scanner object.
    }
}






















































