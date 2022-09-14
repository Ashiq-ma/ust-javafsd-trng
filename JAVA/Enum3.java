package day4set3;
enum Size3{
SMALL,MEDIUM,LARGE,EXTRALARGE;

	public String getSize4() {
		switch(this) {
		case SMALL:
			return "small";
		case MEDIUM:
			return "medium";
		case LARGE:
			return "large";
		case EXTRALARGE:
			return "extra large";
			default:
				return null;
		}
	}

	public static void main(String args[]) {

		System.out.println("The size of the pizza is"+Size3.SMALL.getSize4());
	}
	}


