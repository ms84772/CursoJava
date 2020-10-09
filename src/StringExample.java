public class StringExample {
	public static void main(String[] args) {
		String txt = "We are\\ 'the' so-called\n \"Vikings\" from\t the north.";
		String txt2 = "Mauricio\f";
		System.out.println(txt);
		System.out.println(txt2);
		System.out.println("what ever you want");
		String firstName = "Mauricio";
		String lastName = "Sahagun";
		System.out.println(firstName + lastName);
		System.out.println(firstName + " " + lastName);
		int x = 10;
		int y = 5;
		System.out.println(x + y);
		System.out.println(firstName + y);
		String record = "Jaime,Lopez,1971-01-30,25";
		System.out.println(record);
		String[] splitedRecord = record.split(",");
		System.out.println(splitedRecord);
		for(String s: splitedRecord) {
			System.out.println(s);
		}
		System.out.println(record.length());
		System.out.println(record.replace('0','o'));
		System.out.println(record);
		System.out.println(record.toUpperCase());
		System.out.println(record.toLowerCase());
		System.out.println(record.indexOf('L'));
	}
}
