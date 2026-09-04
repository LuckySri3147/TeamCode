package module1;

 class Assignment165 {
	
	public static void main(String[] args)
	{                                
		StringBuilder sb = new StringBuilder("automation");
		sb.append("testing");
		System.out.println(sb);
		
		sb.insert(10 , "API ");
		System.out.println(sb);
	
		sb.delete(4, 11);
		System.out.println(sb);
		
		sb.replace(12, 16, "done");
		System.out.println(sb);
		
		String s1=sb.substring(4);
		System.out.println(s1);
		
		String s2=sb.substring(2,7);
		System.out.println(s2);
		
		sb.reverse();
		System.out.println(sb); 
		
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(20);
		sb.append("my school name is euro");
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
	}

}



