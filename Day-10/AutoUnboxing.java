class autounboxing {
	public static void main(String[]arsgs) {
		int primitiveint=12;
		Integer wrapperint=primitiveint;
		char primitivechar='a';
		Character wrapperchar=primitivechar;
		System.out.println("Primitive int value:"+primitiveint);
		System.out.println("wrapper int object value:"+wrapperint);
		System.out.println("Primitive char:"+primitivechar);
		System.out.println("wrapper character object:"+wrapperchar);
		System.out.println();
        
		Double wrapperdouble=99.9;
		double primitivedouble=wrapperdouble;
		Boolean wrapperboolean=true;
		boolean primitiveboolean=wrapperboolean;
		System.out.println("Wrapper double object value:"+wrapperdouble);
		System.out.println("primitive double value:"+primitivedouble);
		System.out.println("Wrapper boolean object :"+wrapperboolean);
		System.out.println("primitive boolean type:"+primitiveboolean);
	}
}
