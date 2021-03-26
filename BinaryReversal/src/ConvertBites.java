
public class ConvertBites {

	
	static String invertBits(String n) 
	{ 
	    // Calculate number of bits of N-1; 
		String binaryString = Integer.toBinaryString(Integer.valueOf(n).intValue());
		binaryString = getCorrectBits(binaryString, 8);	 
		
		  StringBuilder sb = new StringBuilder();

		return   sb.append(binaryString).reverse().toString();
	} 
	private static String getCorrectBits(String bitStr, int max){
	    //Create a temp string to add all the zeros
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < (max - bitStr.length()); i ++){
	        sb.append("0");
	    }

	    return (sb.toString()+ bitStr);
	}
	
	public static void main(String[] args) {
		System.out.println(Integer.parseInt(invertBits("47"),2));
	}
}
