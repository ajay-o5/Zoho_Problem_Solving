class stringtoint {
	public static void main(String[]args) {
		String s="123";
		try {
			int result=Integer.parseInt(s);
		   System.out.println("Original string:"+s);
		   System.out.println("converted integer(primitive):"+result);
		   System.out.println("Type verification(addition):"+(result+20));
		   
		}
		catch(NumberFormatException e){
			System.out.println("Error:invalid number format.cannot convert "+s+" to an integer.");
		}
	}
}
