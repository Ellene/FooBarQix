public class FooBarQix {

	enum FBQ {
		FOO(3, "Foo"), BAR(5, "Bar"), QIX(7, "Qix");

		int digit;
		String text;

		FBQ(int digit, String text) {
			this.digit = digit;
			this.text = text;
		}
	}

	public String convert(int i) {

		String representationDiviseur = representationDiviseur(i);
		String representationAffichee = representationAffichee(i);
		if ("".equals(representationDiviseur + representationAffichee)) {
			return String.valueOf(i);
		}
		return representationDiviseur + representationAffichee;

	}

	protected String representationAffichee(int i) {
		String representation = null;
		for (FBQ fbq : FBQ.values()) {
			if (containsValue(i, fbq.digit)) {
				representation = fbq.text;
				break;
			}
		}
		if (representation == null) {
			representation = "";
		}
		if (i > 10) {
			return representationAffichee(i / 10) + representation;
		}
		return representation;
	}

	protected boolean containsValue(int i, int value) {
		return (i != 0 && (i % 10 == value));
	}

	protected String representationDiviseur(int i) {
		String result = "";
		for (FBQ fbq : FBQ.values()) {
			if (i % fbq.digit == 0) {
				result += fbq.text;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FooBarQix fooBarQix = new FooBarQix();
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(fooBarQix.convert(i));
		}
	}
}
