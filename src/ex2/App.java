package ex2;

public class App {



public static String NumberToChar(int number) {

	if ((number <1) || (number >100)) {

		return "Error";

	}

	else if ((number >= 1) && (number <=49)) {

		return "F";

	}

	else if ((number>=50) && (number<= 59)) {

		return "E";

	}

	else if ((number >= 60) && (number <= 69)) {

		return "D";	

	}

	else if ((number >= 70) && (number <=79)) {

		return "C";

	}

	else if ((number >= 80) && (number <= 89)) {

		return "B";

	}

	else {

		return "A";

	}

	
}
}
